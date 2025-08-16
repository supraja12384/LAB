package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Supraja@123";
		
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			// to create table
			/*String create  ="CREATE TABLE employee("
					+"e_id INT PRIMARY KEY,"
					+"e_name VARCHAR(50),"
					+"e_salary INT)";
			PreparedStatement stmt=con.prepareStatement(create);
			stmt.execute();
			System.out.println("Table created");*/
			
			//to insert values
			
		/*String insert ="INSERT into employee values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(insert);
		ps.setInt(1, 103);
		ps.setString(2, "sangeetha");
		ps.setInt(3, 13500);
		ps.executeUpdate();
		System.out.println("value inserted");*/
		
		/*String sql="SELECT * from employee WHERE e_name='chandu'";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("employee id :"+rs.getString(1)+ "employee name :"+rs.getString(2)+ "employee salary :"+rs.getString(3));
		}*/
			
		/*String sql="DELETE FROM employee WHERE e_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 103);
		ps.executeUpdate();*/
			
		String sql="UPDATE employee SET e_salary=? WHERE e_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 20000);
		ps.setInt(2, 102);
		ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}