package student;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

	public class student {
	    public static void main(String[] args) {
	        String driver = "com.mysql.cj.jdbc.Driver";
	        String url = "jdbc:mysql://localhost:3306/java"; // Replace with your DB
	        String user = "root";
	        String pass = "Supraja@123";

	       

	        try {
	            // Step 1: Load the driver
	            Class.forName(driver);
	            System.out.println("Driver loaded successfully");

	            // Step 2: Establish connection
	            Connection  con = DriverManager.getConnection(url, user, pass);
	            System.out.println("Connection established");

	            // Step 3: Create statement
	            Statement stmt = con.createStatement();

	            // Step 4: Execute SQL to create table
	            String sql = "CREATE TABLE IF NOT EXISTS student (" +
	                         "s_id INT PRIMARY KEY," +
	                         "s_name VARCHAR(100),"+
	                         "s_city VARCHAR(100),"+
	                         "s_py int)";
	            stmt.executeUpdate(sql);
	            System.out.println("Table 'student' created:");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        
	    }
	}


