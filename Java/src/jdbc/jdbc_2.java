package jdbc;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.Statement;

	public class jdbc_2 {
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

//	            String sql = "insert into employee1 values(1,'Deepak',10000)";
//	            String sql1 = "insert into employee1 values(2,'Deepu',80000)";
//	            String sql2 = "insert into employee1 values(3,'Deepak',20000)";
//	            String sql3 = "insert into employee1 values(4,'Deepak',40000)";
//	            String sql4 = "insert into employee1 values(5,'Deepak',60000)";
//	         
//	            stmt.addBatch(sql);
//	            stmt.addBatch(sql1);
//	            stmt.addBatch(sql2);
//	            stmt.addBatch(sql3);
//	            stmt.addBatch(sql4);
//	            stmt.executeBatch();
	            String sql="select * from employee";
	            ResultSet rs=stmt.executeQuery(sql);
	            System.out.println("Table 'employee' created successfully");
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

