package com.inheritance;

public class Car extends Vehicle {
	String brand;
	Car()
	{
		
	}
	Car(String color, int vn, String brand)
	{
		super(color, vn);
		this.brand=brand;
	}
}
