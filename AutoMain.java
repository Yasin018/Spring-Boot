package com.springBasics.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
//		ShapeFactory sf = new ShapeFactory();
//		sf.printArea(10, 5);
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.springBasics.autowiring");
		ShapeFactory sf = context.getBean("shapeFactory",ShapeFactory.class);
		sf.printArea(30, 10);
	}

}
