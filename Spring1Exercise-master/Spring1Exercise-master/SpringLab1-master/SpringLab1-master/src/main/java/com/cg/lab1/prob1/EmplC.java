package com.cg.lab1.prob1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class EmplC {
	@Bean(name = "employee")
	public Employee empXyz() {
		Employee emp = new Employee(12345,"Harriet", 40000.0,"PES-BU",30);
		return emp;
	}
}
