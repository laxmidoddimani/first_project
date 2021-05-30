package com.student.io;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class studentdao {
	
	public static boolean inserstudenttoDB(StudentData st) {
		boolean result=false;
		try {
			
			Connection con= Connect.createC();
			String q="insert into students(sname,sphone,scity) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();
			result=true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return result;
	}

	public static boolean StudentDelete(int userId) {
		
		boolean result=false;
		try {
			
			Connection con= Connect.createC();
			String q="delete from students where sid=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setInt(1, userId);
			
			pstmt.executeUpdate();
			result=true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return result;
	}

	public static void ShowAllStudent() {
		
      try {
			
			Connection con= Connect.createC();
			String q="select * from students";
			java.sql.Statement stmt= con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				
				System.out.println("Id    = "+id);
				System.out.println("Name  = "+name);
				System.out.println("Phone = "+phone);
				System.out.println("City  = "+city);
				
				System.out.println("------------------------------");
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
      	
		
	}

	

}
