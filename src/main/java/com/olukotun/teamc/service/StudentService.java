package com.olukotun.teamc.service;

import com.olukotun.teamc.model.Student;

public class StudentService {

	public String printInformation(Student student) {
		String information = "The student whose name is " + student.getName() + " in the department of " + 
	    student.getDepartment() + ", having a registration number of " + student.getRegistrationNo() + " is to report to "
	    		+ " the dean of Engineering with immediate effect";
		
		return information;
		
	}
	
	
	public Student prepareStudentInfo(String name, String department, long registrationNo) {
		 Student student = new Student();
	       
       student.setName(name);
       student.setDepartment(department);
       student.setRegistrationNo(registrationNo);
	       
	       return student;
	}
	
	
	public void add(int bookquantity1, int bookquantity2) {
		bookquantity1 = 3;
		bookquantity2=5;
	}
	
	public void addString(String v1, String v2) {
		v1="inside the method v1";
		v2="inside the method v2";
	}
	
}