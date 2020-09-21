package com.raunaqpahwa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point center;
	
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("The center of the circle is: " + center);
	}

	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
}
