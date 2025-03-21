package com.student.manage;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	
	public static boolean inserStudentToDB(Student st) {
		
		// check data stored or not 
		
		boolean flag = false;
		// jdbc code...
		try {
			Connection con = CP.createC();
			String q = "INSERT INTO students(sname,sphone,scity) VALUES (?,?,?)";
			
			// Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// Set the value of parameter 
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStidentCity());
			
			// Execute...
			pstmt.executeUpdate();
			
			flag = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
		
	}

	public static boolean deleteStudent(int userId) {
		
				// check data Deleted or not 
		
				boolean flag = false;
				// jdbc code...
				try {
					Connection con = CP.createC();
					String q = "DELETE FROM students WHERE sid=?";
					
					// Prepared Statement
					PreparedStatement pstmt = con.prepareStatement(q);
					
					// Set the value of parameter 
					pstmt.setInt(1, userId);
					
					
					// Execute...
					pstmt.executeUpdate();
					
					flag = true;
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return flag;
				
				
	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		// check data Deleted or not 
		
		boolean flag = false;
		// jdbc code...
		try {
			Connection con = CP.createC();
			
			// Query 
			String q = "SELECT * FROM students;";
			
			
			Statement stmt = con.createStatement();
			
			
			// Store in data ResultSet
			ResultSet set = stmt.executeQuery(q);
			
			
			// for print 
			while (set.next()) {
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				
				System.out.println("id : "+id);
				System.out.println("Name : "+name);
				System.out.println("phone : "+phone);
				System.out.println("city : "+ city);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
