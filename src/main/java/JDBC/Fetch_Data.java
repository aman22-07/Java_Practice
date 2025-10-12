package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetch_Data {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","aman@2207");
		System.out.println("Successfully Connected");
		
		PreparedStatement ps=con.prepareStatement("Select * from register");
		ResultSet rs=ps.executeQuery();
		
		while (rs.next()) {
			String name1=rs.getString("name");
			String email1=rs.getString("emain");
			String pass1=rs.getString("password");
			String gender1=rs.getString("gender");
			String city1=rs.getString("city");
			
			System.out.println("Name :"+name1+", Email: " + email1 +", Password: "+pass1+", Gender: "+gender1+", City: "+city1 );
			
			System.out.println("Name :"+rs.getString("name")+", Email: " +rs.getString("emain") +", Password: "+ rs.getString("password")+", Gender: "+rs.getString("gender")+", City: "+rs.getString("city") );

		}
		con.close();
	
			
	}		
			
}