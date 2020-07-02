package com.olukotun.teamc;


import java.util.Scanner;

import com.olukotun.teamc.model.Student;
import com.olukotun.teamc.service.StudentService;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println(" Please enter the name of the student ");
    	
    	String name = scanner.next();
    	
    	System.out.println("Enter ther registration number of the student ");
    	long registrationNo = scanner.nextLong();
    	
    	System.out.println("Enter the department of the student ");
    	
        String department  =  scanner.next();
        
        StudentService studentService = new StudentService();
        
        Student student = studentService.prepareRecord(name, department, registrationNo);
       
        System.out.println(studentService.printInformation(student));
        	
        
 
     
    }
}
