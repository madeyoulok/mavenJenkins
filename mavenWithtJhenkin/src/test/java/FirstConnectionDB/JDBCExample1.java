package FirstConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306/pdborcl", "hr","hr");
		
		Statement stmt = conn.createStatement();
		
		String s = "show databases";
		stmt.executeQuery(s);
		
		conn.close();
		
		System.out.println("program is excuted");
		
		
	}

}
