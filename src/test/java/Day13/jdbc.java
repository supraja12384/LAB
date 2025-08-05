package Day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String url="jdbc:mysql://localhost:3306/1234";
			String user="root";
			String pas="Supraja@123";
			try(Connection con=DriverManager.getConnection(url,user,pas)){
				System.out.println("connection completed");
				String insertsql="INSERT INTO students(id,name,age) VALUES(?,?,?)";
				try(PreparedStatement pstmt=con.prepareStatement(insertsql)){
					pstmt.setInt(1,103);
					pstmt.setString(2,"AKHIL");
					pstmt.setInt(3,23);
					int rows=pstmt.executeUpdate();
					System.out.println("Inserted:"+rows);
					
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			
			

			String readsql="SELECT * FROM STUDENTS";
			try(Statement stmt=con.createStatement()){
				
				ResultSet rs=stmt.executeQuery(readsql);
				
				while(rs.next()) {
					System.out.println("id:"+rs.getInt("id"));
					System.out.println("id:"+rs.getString("name"));
					System.out.println("id:"+rs.getInt("age"));
					
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}


