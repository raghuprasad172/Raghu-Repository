package com.polymorphism;
//example for polymorphism
public class Vehicle {
	String vehicleNumber;
	String color;
	static int vehicleCount;
	Vehicle()
	{
		vehicleCount++;
		vehicleNumber="KA"+vehicleCount;
	}
	Vehicle(String color)
	{
		this();
		this.color=color;
		
	}
	void move()
	{
		System.out.println("vehicle is moving!!!!!!!!!!!");
	}
	void move(String location)
	{
		System.out.println("vehicle is moving towards"+location);
	}
	
}
