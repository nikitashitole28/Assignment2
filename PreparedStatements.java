package Assinment2;
import java.sql.*;

public class PreparedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nikita", "root", "Dilip@8989");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into customer values(?,?)");  
			stmt.setInt(1,101); 
			stmt.setString(2,"abc");  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}

}
