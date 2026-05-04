package com.springBasics.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	
	//auto wiring by type 
//	@Autowired
//	@Qualifier("Rectangle")
	private IShape shape;
	
	@Autowired
	public void setShape(@Qualifier("square") IShape shape) {
		this.shape = shape;
	}
	
	//auto wiring by name 
	//same name for instance variable and bean class
	@Autowired
	private IShape rectangle;
	
	//auto wiring by constructor
	// dont pass variables other than Class objects to constructor
	private IShape nshape;
	public ShapeFactory(@Qualifier("triangle") IShape nshape) {
		this.nshape = nshape;
	}

	public void printArea(double x, double y) {
		shape.area(x, y);
		rectangle.area(x, y);
		nshape.area(x, y);
	}
}
