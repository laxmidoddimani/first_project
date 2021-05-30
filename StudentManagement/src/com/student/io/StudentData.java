package com.student.io;

public class StudentData {
	
   private int Studentid;
   private String StudentName;
   private String StudentPhone;
   private String StudentCity;
   
  public StudentData(int studentid, String studentName, String studentPhone, String studentCity) {
	super();
	Studentid = studentid;
	StudentName = studentName;
	StudentPhone = studentPhone;
	StudentCity = studentCity;
  }

  public StudentData(String studentName, String studentPhone, String studentCity) {
	super();
	StudentName = studentName;
	StudentPhone = studentPhone;
	StudentCity = studentCity;
  }

  public StudentData() {
	super();
	// TODO Auto-generated constructor stub
   }

public int getStudentid() {
	return Studentid;
}

public void setStudentid(int studentid) {
	Studentid = studentid;
}

public String getStudentName() {
	return StudentName;
}

public void setStudentName(String studentName) {
	StudentName = studentName;
}

public String getStudentPhone() {
	return StudentPhone;
}

public void setStudentPhone(String studentPhone) {
	StudentPhone = studentPhone;
}

public String getStudentCity() {
	return StudentCity;
}

public void setStudentCity(String studentCity) {
	StudentCity = studentCity;
}

@Override
public String toString() {
	return "StudentData [Studentid=" + Studentid + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
			+ ", StudentCity=" + StudentCity + "]";
}
  
  
   
   
   
}
