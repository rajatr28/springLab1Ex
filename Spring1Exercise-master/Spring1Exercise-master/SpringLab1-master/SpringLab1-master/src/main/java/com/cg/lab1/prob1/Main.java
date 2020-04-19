package com.cg.lab1.prob1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new AnnotationConfigApplicationContext(EmplC.class);

		
		Employee emp=(Employee) factory.getBean("employee");
		System.out.println("Employee details");
		System.out.println("----------------------------");
		System.out.println("Employee ID : "+emp.getEmployee_Id());
		System.out.println("Employee Name : "+emp.getEmployee_Name());
		System.out.println("Employee Salary : "+emp.getEmployee_Salary());
		System.out.println("Employee BU : "+emp.getEmployee_BU());
		System.out.println("Employee Age : "+emp.getEmployee_Age());
		
		((AnnotationConfigApplicationContext) factory).close();
	}


}
