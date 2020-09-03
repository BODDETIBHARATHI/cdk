import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("com.mysql.cj.jdbc.Driver");

			
			//MySQL
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root"); //MySQL connection 

			//Oracle
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.104:1521:xe","bharathi","bharathi");
			System.out.println("Got the connection");
//			//Statment
//			String insertData = "insert into employee values ('ABC',10,1000,'JAVA')";
//			Statement st = con.createStatement();
//			int row_inserted = st.executeUpdate(insertData);
//			if(row_inserted>0)
//				System.out.println("Rows inserted");
//			else
//				System.out.println("Sorry");
			
			//catch (ClassNotFoundException | SQLException e)
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
