package com.student.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

	public static void main(String[] args) throws NumberFormatException, 
	 IOException{
		// TODO Auto-generated method stub
       System.out.println("my app started");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
        	System.out.println("Press 1 to ADD Student");
        	System.out.println("Press 2 to DELETE Student");
        	System.out.println("Press 3 to Display Student");
        	System.out.println("Press 4 for exit");
        	int c=Integer.parseInt(br.readLine());
        	
        	if(c==1) {
        		System.out.println("Enter the name: ");
        		String name=br.readLine();
        		
        		System.out.println("Enter the phone: ");
        		String phone=br.readLine();
        		
        		System.out.println("Enter the city: ");
        		String city=br.readLine();
        		
        		StudentData st=new StudentData(name,phone,city);
        		boolean answer=studentdao.inserstudenttoDB(st);
        		
        		if(answer) {
        			System.out.println("Student is added successfully");
        		}
        		else {
        			System.out.println("Somthing went wrong");
        		}
        			
        			
        		System.out.println(st);
        	}
        	else if(c==2) {
        		
        		System.out.println("Enter the student id to Delete: ");
        		int userId=Integer.parseInt(br.readLine());
        		
        		boolean answer=studentdao.StudentDelete(userId);
        		
        		if(answer) {
        			System.out.println("Student succesfully deleted");
        		}
        		else {
        			System.out.println("Somthing went wrong..");
        		}
        		
        	}
            else if(c==3) {
        		
            studentdao.ShowAllStudent();
            	
        	}
            else if(c==4) {
        		break;
        	}
            else {
            	
            }
        }
       System.out.println("Thank you for using the app"); 
	}

}
