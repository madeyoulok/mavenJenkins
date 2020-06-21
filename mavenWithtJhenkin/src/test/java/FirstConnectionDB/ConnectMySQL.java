package FirstConnectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		System.out.println("Driver loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtech", "root", "root");
		System.out.println("Connected to MySQL DB");

		Statement stmt = con.createStatement();

		String s = "select * from employee";		
		
		ResultSet rs = stmt.executeQuery(s);
		
		System.out.println("program is excuted");
		System.out.println("Employee ID"+"\t"+"First Name"+"\t"+"Last Name"+"\t"+"Salary"+"\t"+"\t"+"City"+"\t"+"\t"+"Order ID"+"\t"+"Department"+"\t"+"Email");
		
		while(rs.next()) {
			
			String empID = rs.getString("emp_id");
			String firstname = rs.getString("First_Name");			
			String lastname = rs.getString("Last_Name");
			String salary = rs.getString("salary");
			String city = rs.getString("City");
			String orderid = rs.getString("order_id");
			String dept = rs.getString("dept");
			String email = rs.getString("email");
			//System.out.println("Employee ID"+"\t"+"First Name"+"\t"+"Last Name"+"\t"+"Salary"+"\t"+"City"+"\t"+"Order ID"+"\t"+"Department"+"\t"+"Email");
			System.out.println(empID+"\t"+"\t"+firstname+"\t"+"\t"+lastname+"\t"+"\t"+salary+"\t"+"\t"+city+"\t"+"\t"+orderid+"\t"+"\t"+dept+"\t"+"\t"+email);
			
		}
	}

}
