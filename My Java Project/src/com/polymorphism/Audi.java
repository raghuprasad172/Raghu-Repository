package com.polymorphism;

public class Audi extends Car {
	String type;
	Audi()
	{
		
	}
	Audi(String color, String name, String type)
	{
		super(color, name);
		this.type=type;
	}
	
	void move(String location)
		{
		System.out.println("Car is moving towards "+location);
		}
}
	
	
