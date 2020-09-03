import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Employee;

public class DemoUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.104:1521:xe","bharathi","bharathi");
		System.out.println("Got the connection");
		String updateData = "update employee set empName=? where empId=?";  // first ? is String and second ? is for int
		
		PreparedStatement ps = con.prepareStatement(updateData);
		ps.setString(1, "ABCD XYZ");
		ps.setInt(2,12);
		
		int updated = ps.executeUpdate();
		if(updated > 0)
			System.out.println("Updated");
		else
			System.out.println("No record found");
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
