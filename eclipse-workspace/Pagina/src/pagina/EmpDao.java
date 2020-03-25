package pagina;

import foglio.*;
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
public class EmpDao {
	
    public static Connection getConnection(){  
        Connection con = null;
        try{  
        	String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver); 
            String mySqlUrl = "jdbc:mysql://localhost:3306/test?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";;
             con = DriverManager.getConnection(mySqlUrl,"luca","luca");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","marco2003"); 
            
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
  
    public static List<Emp> getRecords(int start,int total){  
        List<Emp> list=new ArrayList<Emp>();  
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement(  
"select * from emp limit "+(start-1)+","+total);  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setSalary(rs.getFloat(3));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){System.out.println(e);}  
        return list;  
    }  
}  
	
	
	
