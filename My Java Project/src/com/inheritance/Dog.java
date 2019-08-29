package com.inheritance;
public class Dog extends Animal{
	String name;
	void sniff()
	{
		System.out.println("Dog sniffs");
	}
	Dog()
	{
		
	}
	Dog(double heigth, double weight, String name)
	{
		super(heigth,weight);
		this.name=name; 
	}
	
}
