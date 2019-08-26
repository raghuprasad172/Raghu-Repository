//wap to design a class representing an entity known as marker
//having the following property
//1 color
//2 name
//3 length
//4 price
//design a method to known as initialize to assign a value
//the method should accept the value to be initialized
package com.nonstaticmembers;

public class Marker {
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
	}

	
	public static void main(String[] args) {
		Marker m1 = new Marker();
		m1.initializer("Rorito", "blue", 100, 3.2);
		System.out.println("name:"+m1.name);
		System.out.println("color:"+m1.color);
		System.out.println("length:"+m1.length);
		System.out.println("cost:"+m1.cost);
		
	}

}
