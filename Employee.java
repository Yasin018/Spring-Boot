package com.springBasics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")

public class Employee {
	private String employeeName;
	
	public String greet() {
		return "Welcome " + employeeName;
	}
	
	//value is not used to set static value like this
	// it is used to retrieve values provided from the application.properties file
	//@Value("Example")
	@Value("${employee.empName}") //expression language
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
