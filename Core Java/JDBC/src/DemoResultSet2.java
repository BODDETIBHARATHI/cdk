import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Employee;

public class DemoResultSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.104:1521:xe","bharathi","bharathi");
		System.out.println("Got the connection");
		String findData = "select * from employee";
		
		PreparedStatement ps = con.prepareStatement(findData);
		
//		int empId = 10;//set ? to according to thsi
//		ps.setInt(1, empId);
//		
		ResultSet set = ps.executeQuery();
		
		while(set.next()) {
			String name = set.getString(1);
			int id = set.getInt("empId");
			int sal = set.getInt(3);
			String tech = set.getString("technology");
			System.out.println(name + " , "+id+" , "+sal+" , "+tech);
			Employee employee = new Employee(name, id, sal, tech);
		}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
