
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pojo.Employee;

public class DemoPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "DEF123";
		int empId = 13;
		int salary = 2000;
		String technology = "C#";
		Employee emp = new Employee(name, empId, salary, technology);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.104:1521:xe","bharathi","bharathi");
		System.out.println("Got the connection");
		String insertData = "insert into employee values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(insertData);
		ps.setString(1, emp.getEmpName());
		ps.setInt(2, emp.getEmpId());
		ps.setInt(3,emp.getSalary());
		ps.setString(4, emp.getTechnology());
	
		
		
		int updated = ps.executeUpdate();
		if(updated > 0)
			System.out.println("inserted value");
		else
			System.out.println("Sorry");
		
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
