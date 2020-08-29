import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Employee;

public class DemoDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.104:1521:xe","bharathi","bharathi");
		System.out.println("Got the connection");
		String deleteData = "delete from employee where empName=?";  // first ? is String and second ? is for int
		
		PreparedStatement ps = con.prepareStatement(deleteData);
		ps.setString(1,"ABCD XYZ");
		String query = "delete from users where id = ?";
//	      PreparedStatement preparedStmt = con.prepareStatement(query);
//	      preparedStmt.setInt(1, 3);
//
//	      // execute the preparedstatement
//	      preparedStmt.execute();
		
		
		boolean deleted = ps.execute();
		System.out.println("deleted : "+deleted);
		if(deleted)
			System.out.println("Deleted");
		else
			System.out.println("No record found");
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
