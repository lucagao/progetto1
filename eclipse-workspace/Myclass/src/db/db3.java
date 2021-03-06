package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;

public class db3 {

	public static void main(String[] args) {
		
		// create connection
		DB db1 = new DB("dstech-1", "people", "luca", "luca");
		db1.connect();
		
		// Scan input
		Scanner in = new Scanner(System.in);
		
		System.out.println(
			"Do you want to select, insert, update, or delete? [s/i/u/d]"
		);
		String choice = in.nextLine();
		
		switch( choice ) {
			case "s":
				db1.select(new String[] {"name", "age"});
			break;
			
			case "i":
				String n = "", a = "";
				
				System.out.println("Insert name:");
				n = in.nextLine();
				System.out.println("Insert age:");
				a = in.nextLine();
				
				db1.insert(
					new String[] {"name", "age"},
					new String[] {n, a}
				);
			break;
			
			case "u":
				String f = "", v = "", id = "";
				System.out.println("Insert id of row to update:");
				id = in.nextLine();
				
				System.out.println("Insert field name:");
				f = in.nextLine();
				System.out.println("Insert new value:");
				v = in.nextLine();
				
				db1.update(id, f, v);
			break;
			
			case "d":
				String uid = "";
				System.out.println("Insert id of row to delete:");
				uid = in.nextLine();
				
				db1.delete(uid);
			break;
			
			default:
				System.out.println("Wrong choice");
		}
		
		db1.close();
		
	}

}

class DB {
	final String dbName;
	final String user;
	final String password;
	
	String table;
	String driver;
	String url;
	Connection con;
	
	DB(String dbn, String t, String un, String pw) {
		dbName = dbn;
		table = t;
		user = un;
		password = pw;
		connect();
	}
	
	void connect() {
		try {
			driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			url = 
	"jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
			con = DriverManager.getConnection(url, user, password);	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void select(String[] fields) {
		
		String query = "SELECT ";
		
		for(int i = 0; i < fields.length; i++) {
			query += fields[i] + ( (i == fields.length-1) ? "" : ", " );
		}
		
		query += " FROM " + table;
		
		try {
			Statement cmd = con.createStatement();
			ResultSet res = cmd.executeQuery(query);
			while (res.next()) {
				for(int i = 0; i < fields.length; i++) {
					System.out.print(res.getString(fields[i]) + " ");
				}
				System.out.println();
			}
			res.close();
			cmd.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	void insert(String[] fields, String[] values) {
		
		String query = "INSERT INTO "+table+" (";
		for(int i = 0; i < fields.length; i++) {
			query += fields[i] + ( (i == fields.length-1) ? "" : ", " );
		}
		query += ") VALUES(";
		for(int i = 0; i < values.length; i++) {
			query += "'" + values[i] + "'" + ( (i == fields.length-1) ? "" : ", " );
		}
		query += ")";
		
		try {
			Statement cmd = con.createStatement();
			cmd.executeUpdate(query);
			System.out.println("Insert done!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	void delete(String id) {
		String query = "DELETE FROM "+table+" WHERE id = " + id;
		
		try {
			Statement cmd = con.createStatement();
			cmd.executeUpdate(query);
			System.out.println("Delete done!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void update(String id, String field, String value) {
		String query = String.format("UPDATE %s SET %s = '%s' WHERE id = %s"
				, table, field, value, id);
		
		try {
			Statement cmd = con.createStatement();
			cmd.executeUpdate(query);
			System.out.println("Update done!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
