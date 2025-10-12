package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception{
		
		//String name1="amit";
		String email1="amit@gmail.com";
		//String pass1="amit123";
		//String gender1="Male";
		//String city1="Mumbai";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","aman@2207");
		System.out.println("Successfully Connected");
		
		//PreparedStatement ps=con.prepareStatement("insert into register values('Aman','aman@gmail.com','aman123','male','chandigarh')");
	//	PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
		
		// Updating from Chandigarh to mumbai
		//PreparedStatement ps=con.prepareStatement("update register set city=? where emain=?");
		PreparedStatement ps=con.prepareStatement("delete from register where emain=?");
		
		/*
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		*/
		
		//ps.setString(1, city1);
		ps.setString(1, email1);
		int i=ps.executeUpdate();
		
		
		if(i>0) {
			System.out.println("Updated Successfully");
		}
		else {
			System.out.println("Failed");
		}
		con.close();
	}

}
