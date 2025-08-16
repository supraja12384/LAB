package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_project {
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
            String sql = "CREATE TABLE IF NOT EXISTS employee (" +
                         "id INT PRIMARY KEY," +
                         "name VARCHAR(100)," +
                         "salary DOUBLE)";
            stmt.executeUpdate(sql);
            System.out.println("Table 'employee' created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
}
