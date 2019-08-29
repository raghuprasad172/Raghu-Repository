package com.inheritance;

public class Vehicle {
	String color;
	int vn;
	void move()
	{
		System.out.println("vehicle is moving");
	}
	Vehicle()
	{
		
	}
	Vehicle(String color, int vn)
	{
		this.color=color;
		this.vn=vn;
	}
}
