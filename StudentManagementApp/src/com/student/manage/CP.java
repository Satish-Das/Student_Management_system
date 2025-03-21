package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CP {
	
	static Connection con;
	
	public static Connection createC() throws SQLException {
		
		
		
		// Load The driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			// Create the connection 
			String user = "root";
			String password = "SAtish980@";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url,user, password);		
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
}
