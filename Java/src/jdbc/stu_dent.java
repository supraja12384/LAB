package jdbc;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class stu_dent{

		public static void main(String[] args) {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/java";
			String user="root";
			String password="Supraja@123";
			try {
				//load the driver
				Class.forName(driver);
				System.out.println("Driver loaded");
				//establish the connection
				Connection c=DriverManager.getConnection(url,user,password);
				System.out.println("Connection established");
				//write query
				String sql="SELECT * FROM stu_dent where s_id=2";
				PreparedStatement ps=c.prepareStatement(sql);
				ResultSet rs= ps.executeQuery(sql);
				while(rs.next()) {
					System.out.println("Student Id:"+rs.getString(1)+" Student name:"+rs.getString(2)+" Student passout year:"+ rs.getString(3));
				}
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


