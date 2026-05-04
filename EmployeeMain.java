package com.springBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// Usual process of us creating object
//		Employee emp = new Employee();
//		emp.setEmployeeName("Yasin");
//		System.out.println(emp.greet());
		
		//creating IoC container
		ApplicationContext context = new AnnotationConfigApplicationContext("com.springBasics");
		String[] beanNames = context.getBeanDefinitionNames();
		for(String bean: beanNames) {
			//we will get 4 inbuilt beans & our employee object created which is a bean
			System.out.println(bean);
		}
		
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp.greet());
		
		//spring beans created by the IoC container are singleton by nature
		//they create only one object for class
		
	}

}
