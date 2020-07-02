package com.firstjava.oop.firstoop.Service;

import com.firstjava.oop.firstoop.model.Student;

public class StudentService {

	public String call(Student student) {
		String response = "My name is : " + student.getName();
		
		return response;
	}
	
	
	
	public Student prepareStudent(String name, String dept) {
	
		Student student = new Student();
		student.setName(name);
		student.setDept(dept);
		//THis is where I return my student
		
		return student;
	}
}
