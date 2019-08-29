package com.inheritance;

public class Animal {
	double heigth;
	double weight;
	void talk()
	{
		System.out.println("Animal talks");
	}
	Animal()
	{
		
	}
	Animal(double heigth, double weight)
	{
		this.heigth=heigth;
		this.weight=weight;
		
	}
}