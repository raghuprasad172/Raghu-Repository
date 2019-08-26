package com.nonstaticmembers;

public class Marker1 {
	String name;
	String color;
	int cost;
	double length;
	void initializer(String name, String color, int cost, double length)//initialize the value of the property
	{
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.length=length;
		System.out.println("name:"+this.name);
		System.out.println("color:"+this.color);
		System.out.println("length:"+this.length);
		System.out.println("cost:"+this.cost);
	}

	public static void main(String[] args) {
		Marker1 m1 = new Marker1();
		m1.initializer("Rorito", "blue", 100, 3.2);
		Marker1 m2 = new Marker1();
		m2.initializer("cello", "black", 70, 4.0);
		
	}

}
