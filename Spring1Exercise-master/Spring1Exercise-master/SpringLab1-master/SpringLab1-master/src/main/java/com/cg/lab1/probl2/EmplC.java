package com.cg.lab1.probl2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class EmplC {
	@Bean(name = "employee")
	public Employee empXyz() {
		Employee empl = new Employee(12345,"Harriet", 40000.0,"PES-BU",30, addXyz());
		return empl;
	}
	
	@Bean
	public SBU addXyz() {
		SBU add = new SBU();
		add.setsbuId("PES-BU");
		add.setsbuName("Kiran Rao");
		add.setsbuHead("Product Engineering Services");
		return add;
}
}