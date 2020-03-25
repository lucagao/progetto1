package Exam;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Database {

	public static void main(String[] args) {
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			String url = 
"jdbc:mysql://localhost:3306/dstech-1?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
			Connection con = DriverManager.getConnection(url, "luca", "luca");
			Statement cmd = con.createStatement();
			String qry = "SELECT , name, age, type, race FROM Animal"; 
			ResultSet res = cmd.executeQuery(qry);
			while (res.next()) {
				//System.out.println(res.getInt(0));
				System.out.println(res.getString("name"));
				System.out.println(res.getString("type"));
				System.out.println(res.getString("age"));
				System.out.println(res.getString("race"));
			}

			Scanner in = new Scanner(System.in);
			
			System.out.println("Do you want to insert a new Animal? [y/n]");
			
			String choice = "y";
			do {
			
			System.out.println("Give me a name :");
			String name = in.nextLine();
			
			System.out.println("Give me an age");
			int age = Integer.parseInt(in.nextLine());
			
			System.out.println("Give me an type");
			int type = Integer.parseInt(in.nextLine());
			
			System.out.println("Give me an race");
			int race = Integer.parseInt(in.nextLine());
			
			
			
			String sql = String.format(
					"INSERT INTO Animal (name,age,type,race) VALUES ('%s', %d,'%s','%s')",
					name,age,type,race
					);
			cmd.executeUpdate(sql);
			
			System.out.println("Do you want to insert a new Animal? [y/n]");
			choice = in.nextLine();
			} while ( choice.equals("y"));
			
			in.close();
			res.close();
			cmd.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}
}