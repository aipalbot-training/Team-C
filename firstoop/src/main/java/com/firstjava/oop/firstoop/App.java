package com.firstjava.oop.firstoop;

import java.util.Scanner;

import com.firstjava.oop.firstoop.Service.StudentService;
import com.firstjava.oop.firstoop.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        Student s1 = new Student();
        s1.setName("Ikenna");
        s1.setDept("MEE");
        s1.setLevel("CSC");
        
        Student s2 = new Student();
        s2.setName("Bruno");
        s2.setDept("CSC");
        s2.setLevel("300L");
        
        Student s3 = new Student();
        s3.setName("Bruno");
        s3.setDept("CSC");
        s3.setLevel("300L");
        
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        for(Student s: students) {
        	System.out.println("*************************************");
        	System.out.println("Name: " + s.getName());
        	System.out.println("Dept: " + s.getDept());
        	System.out.println("Level: " + s.getLevel());
        	
        }*/
    	
    	//Assignment OOP
    	
    	Scanner studentName = new Scanner(System.in);
    	System.out.println("Enter Student Name: ");
    	String stuName = studentName.nextLine();
    	
    	Scanner studentDept = new Scanner(System.in); 
    	System.out.println("Enter Student Department: ");
    	String stuDept = studentDept.nextLine();
    	
    	Scanner studentLevel = new Scanner(System.in); 
    	System.out.println("Enter Student Level: ");
    	String stuLevel = studentLevel.nextLine();
    	
    	
    
    	
    	StudentService studentService = new StudentService();
    	Student newStudent = studentService.registerStudent(stuName, stuDept, stuLevel);
    	
    	
    	System.out.println(studentService.displayName(newStudent));
    	
    }
}
