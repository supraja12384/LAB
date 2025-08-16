package jdbc;


	


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.Statement;

	public class jdbc_1 {
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

	            String sql = "insert into employee values(1,'supraja',10000)";
	            String sql1 = "insert into employee values(2,'sai',80000)";
	            String sql2 = "insert into employee values(3,'yadav',20000)";
	            String sql3 = "insert into employee values(4,'sangeeetha',40000)";
	            String sql4 = "insert into employee values(5,'chandu',60000)";
	         
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

