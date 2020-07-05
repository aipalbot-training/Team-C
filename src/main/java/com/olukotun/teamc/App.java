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
    	StudentService studentService = new StudentService();
    	
    	
    	int bookQuantity1 = 2;
    	int bookQuantity2 = 1;
    	
    	studentService.add(bookQuantity1, bookQuantity2);
    	
    	System.out.println("BookQuantity1: " + bookQuantity1);
    	System.out.println("BookQuantity2: " + bookQuantity2);
    	
    	String x = "Outside the method v1";
    	String y = "outside the method v2";
    	studentService.addString(x, y);
    	
    	
    	System.out.println("v1:" + x);
    	System.out.println("v2:" + y);
    	
    	
    	
    	
    	
    	
    	
    	
//    	Scanner scanner = new Scanner(System.in);
//    	
//    	System.out.println("Please enter student's name: ");
//    	
//    	String name = scanner.next();
//    	
//    	System.out.println("Enter the student's registration number ");
//    	long registrationNo = scanner.nextLong();
//    	
//    	System.out.println("Enter the student's department ");
//    	
//        String department  =  scanner.next();
//        
//        
//        
//        Student student = studentService.prepareStudentInfo(name, department, registrationNo);
//       
//        System.out.println(studentService.printInformation(student));
//        	
        
 
     
    }
  
    
  
}
