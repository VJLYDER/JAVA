package com.dedalus.view;

import java.util.Scanner;

import com.dedalus.controller.Employee_Controller;
import com.dedalus.model.Employee;


public class Main {

	
	
	public static void main(String[] args) {
		
		System.out.println("welcome to ems");
		
		Employee_Controller ec = new Employee_Controller();

		
		Scanner sc= new Scanner(System.in);
		String ch;
		
		do {
			System.out.println("Enter your choice");
			
			System.out.println("1 for addemployee");
			System.out.println("2 for display the employee details");
			
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:{
			
			ec.addEmployee();
			break;
			
		}
        case 2:{
        	
        	ec.veiwEmployee();
        	break;
			
		}
        default:{
        	
        	System.out.println("entered a wrong number");
        	break;
        	
        }
        
		} 
		
        System.out.println("do you want to continue : Y or N");
        ch = sc.next(); 
        
		}while(ch.equals("Y") || ch.equals("y"));	  
		
		System.out.println("thanks for using our System");
		System.exit(0);
		
	}
	
}

		
		
		
		
		

	


