package student;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.Statement;

	public class student_final {
		public static void main(String[] args) {
	      
			String driver = "com.mysql.cj.jdbc.Driver";
	        String url = "jdbc:mysql://localhost:3306/java"; 
	        String user = "root";
	        String pass = "Supraja@123";

	        try {
	           
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded successfully");

	            Connection  con = DriverManager.getConnection(url, user, pass);
	            System.out.println("Connection established");

	            /*Statement stmt = con.createStatement();

	            String sql = "insert into student values(1,'sai','kadapa',2024)";
	            String sql1 = "insert into  student values(2,'supraja','nellore,2023)";
	            String sql2 = "insert into  student values(3,'chandu','kadapa',2024)";
	            String sql3 = "insert into  student values(4,'sree','kurnool',2025)";
	            
	            /*stmt.addBatch(sql);
	            stmt.addBatch(sql1);

	            stmt.addBatch(sql2);
	            stmt.addBatch(sql3);
	        
	            stmt.executeBatch();
	            String sql5="select * from student";
	            ResultSet rs=stmt.executeQuery(sql5);
	            System.out.println("Table 'student' created successfully");
	            while(rs.next()) {
	            	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
	            }
	            ResultSetMetaData rsd=rs.getMetaData();
	            System.out.println(rsd.getColumnCount());
	            System.out.println(rsd.getTableName(1));
	            System.out.println(rsd.getColumnName(1)+" "+rsd.getColumnName(2)+" "+rsd.getColumnName(3));*/
	            String sql="insert into student values($,$,$,$)";
	            PreparedStatement ps=con.prepareStatement(sql);
	            ps.setInt(1, 1);
	            ps.setString(2, "supraja");
	            ps.setInt(3, 2024);
	            ps.setString(4, "kadapa");
	 

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        
	        
	    }
	}



