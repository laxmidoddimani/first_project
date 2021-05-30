package com.student.io;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connect {
	
	static Connection con;
	
	public static Connection createC() {
		try {
			
			//load Driver
			Class.forName("com.mysql.jdbc.Driver");
				
			//create connection
			String user="root";
			String Password="Hacker@123";
			String url="jdbc:mysql://localhost:3306/student_management";
			
			con=DriverManager.getConnection(url,user,Password);
			
		}catch (Exception e){
			
			e.printStackTrace();
			
		}
		
		return con;
	}

}
