package Assinment2;

import java.sql.*;

public class Statement1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikita", "root", "Dilip@8989");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp1");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
	
	}
}
