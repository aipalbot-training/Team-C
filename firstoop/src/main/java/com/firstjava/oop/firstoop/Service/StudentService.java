package com.firstjava.oop.firstoop.Service;

import com.firstjava.oop.firstoop.model.Student;

public class StudentService {

	public String displayName(Student student) {
	
		String response = "My name is : " + student.getName() + " My Department is : " +  student.getDept() + " My Level is : " + student.getLevel();
		
		return response;
	}
	
	
	
	
	public Student registerStudent(String name, String dept, String level) {
	
		Student student = new Student();
		student.setName(name);
		student.setDept(dept);
		student.setLevel(level);
		
		
		//THis is where I return my student
		
		return student;
	}
}
