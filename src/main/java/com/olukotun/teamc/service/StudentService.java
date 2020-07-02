package com.olukotun.teamc.service;

import com.olukotun.teamc.model.Student;

public class StudentService {

	public String notice(Student student) {
		String information = "The student whose name is " + student.getName() + " in the department of " + 
	    student.getDepartment() + ", having a registration number of " + student.getRegistrationNo() + " is to report to "
	    		+ " the dean of Engineering with immediate effect";
		
		return information;
		
	}
	
	
	public Student prepareRecord(String name, String department, long registrationNo) {
		 Student student = new Student();
	       
       student.setName(name);
       student.setDepartment(department);
       student.setRegistrationNo(registrationNo);
	       
	       return student;
	}
	
}