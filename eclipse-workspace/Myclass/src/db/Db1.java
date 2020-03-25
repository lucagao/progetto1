package db;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Db1 {

		public static void main(String[] args) {
			
			try {
				String driver = "com.mysql.cj.jdbc.Driver";
				Class.forName(driver);
				String url = 
	"jdbc:mysql://localhost:3306/dstech-1?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
				Connection con = DriverManager.getConnection(url, "luca", "luca");
				Statement cmd = con.createStatement();
				String qry = "SELECT id, name, age FROM people"; // WHERE name = 'kevin'
				ResultSet res = cmd.executeQuery(qry);
				while (res.next()) {
					//System.out.println(res.getInt(0));
					System.out.println(res.getString("name"));
					System.out.println(res.getString("age"));
				}
				
				/*
				String sql = "INSERT INTO people (name, age)" +
		                   "VALUES ('Mohamed', 40)"; */
				//cmd.executeUpdate(sql);
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