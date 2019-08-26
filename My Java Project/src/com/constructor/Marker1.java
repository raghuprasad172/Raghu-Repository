package com.constructor;

public class Marker1 {
	String color;
	double length;
	//creating a parameterized constructor
	Marker1(String color, double length)
	{
		this.color=color;
		this.length=length;
	}
	public static void main(String[] args) {
		Marker1 m1 = new Marker1("Black", 3.4);
		System.out.println("color:"+m1.color+"  length:"+m1.length);
	}

}
