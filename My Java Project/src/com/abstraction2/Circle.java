package com.abstraction2;

public class Circle implements Shape {
	double area;
	
	
	@Override
	public double area(int length) {
		area = (PI*length);
		return area;
	}
}
