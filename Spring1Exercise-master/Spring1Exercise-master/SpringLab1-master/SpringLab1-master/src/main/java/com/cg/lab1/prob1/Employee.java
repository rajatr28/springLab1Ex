package com.cg.lab1.prob1;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int Employee_Id;
	private String Employee_Name;
	private double Employee_Salary;
	private int Employee_Age;
	private String Employee_BU;
	
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int Employee_Id) {
		this.Employee_Id=Employee_Id;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String Employee_Name) {
		this.Employee_Name=Employee_Name;
	}
	public double getEmployee_Salary() {
		// TODO Auto-generated method stub
		return Employee_Salary;
		
	}
	public void setEmployee_Salary(double Employee_Salary) {
		// TODO Auto-generated method stub
		this.Employee_Salary=Employee_Salary;
		
	}
	public String getEmployee_BU() {
		// TODO Auto-generated method stub
		return Employee_BU;
		
	}
	public void setEmployee_BU(String Employee_BU) {
		// TODO Auto-generated method stub
		this.Employee_BU=Employee_BU;
		
	}
	public int getEmployee_Age() {
		// TODO Auto-generated method stub
		return Employee_Age;
		
	}
	public void setEmployee_Age(int Employee_Age) {
		// TODO Auto-generated method stub
		this.Employee_Age=Employee_Age;
	}
	public Employee(int Employee_Id, String Employee_Name, double Employee_Salary, String Employee_BU, int Employee_Age) {
		super();
		this.Employee_Id=Employee_Id;
		this.Employee_Name=Employee_Name;
		this.Employee_Salary=Employee_Salary;
		this.Employee_BU=Employee_BU;
		this.Employee_Age=Employee_Age;
	}

}
