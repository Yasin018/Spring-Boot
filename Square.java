package com.springBasics.autowiring;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Square implements IShape {

	@Override
	public void area(double x, double y) {
		System.out.println("Sq: "+(x*x));
	}
	
}
