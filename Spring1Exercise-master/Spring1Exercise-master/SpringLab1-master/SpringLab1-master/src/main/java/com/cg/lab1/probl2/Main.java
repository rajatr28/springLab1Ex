package com.cg.lab1.probl2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new AnnotationConfigApplicationContext(EmplC.class);

		
		Employee emp=(Employee) factory.getBean("employee");
		System.out.println("Employee details");
		System.out.println("----------------------------");
		System.out.println("Employee [ "+"Employee Age : "+emp.getEmployee_Age()+", empId= "+emp.getEmployee_Id()+", Employee Name= "+emp.getEmployee_Name()
		+", Employee Salary= "+emp.getEmployee_Salary());
		System.out.println("sbu details=SBU [ "+ "sbucode= "+emp.getsbu().getsbuId()+","+"sbuHead= "+emp.getsbu().getsbuHead()+","+
		"sbuName= "+emp.getsbu().getsbuName()+"] ]");
		((AnnotationConfigApplicationContext) factory).close();
	}


}


