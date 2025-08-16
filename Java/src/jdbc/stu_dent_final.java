package jdbc;



	


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.Statement;

	public class stu_dent_final {
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

	            String sql = "insert into student values(1,'supraja',2024)";
	            String sql1 = "insert into student  values(2,'sai',2024)";
	            String sql2 = "insert into student  values(3,'yadav',2024)";
	            String sql3 = "insert into student  values(4,'sangeeetha',2024)";
	            String sql4 = "insert into student  values(5,'chandu',2024)";
	         
	            stmt.addBatch(sql);
	            stmt.addBatch(sql1);
	            stmt.addBatch(sql2);
	            stmt.addBatch(sql3);
	            stmt.addBatch(sql4);
	            stmt.executeBatch();
	            

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        
	        
	    }
	

}
