package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.Statement;


	public class stu_dent_table {
			public static void main(String[] args) {
		      
				String driver = "com.mysql.cj.jdbc.Driver";
		        String url = "jdbc:mysql://localhost:3306/java"; 
		        String user = "root";
		        String pass = "Supraja@123";

		        try {
		           
		            Class.forName(driver);
		            System.out.println("Driver loaded successfully");

		            Connection  con = DriverManager.getConnection(url, user, pass);
		            System.out.println("Connection established");

		            Statement stmt = con.createStatement();

		            String sql="select * from stu_dent";
		            ResultSet rs=stmt.executeQuery(sql);
		            System.out.println("Table 'student' created successfully");
		            while(rs.next()) {
		            	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		            }
		            ResultSetMetaData rsd=rs.getMetaData();
		            System.out.println(rsd.getColumnCount());
		            System.out.println(rsd.getTableName(1));
		            System.out.println(rsd.getColumnName(1)+" "+rsd.getColumnName(2)+" "+rsd.getColumnName(3));
		            

		        } catch (Exception e) {
		            e.printStackTrace();
		        } 
		        
		        
		    }
		}
		

	


