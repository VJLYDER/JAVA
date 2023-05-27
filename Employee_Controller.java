package com.dedalus.controller;

import java.util.Scanner;

import com.dedalus.model.Employee;

public class Employee_Controller {
	
	Scanner sc = new Scanner(System.in);
	Employee emp= new Employee();
	
	public void addEmployee() {
		
        
        System.out.println("enter emp no");
        int eno = sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("enter emp name");
        String ename = sc.next();
	    emp.setEname(ename);
	    
	    System.out.println("employee added successfully");
	  
	}
	
	public void veiwEmployee() {
		
		    System.out.println(emp.getEmpno());
		    System.out.println(emp.getEname());
		
	}

}
