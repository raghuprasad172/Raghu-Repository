package com.nonstaticmembers;

public class A {
	int i;
	int j;
	public static void main(String[] args) {
		//creating the object1
		A ob1 = new A();
		//displaying
		System.out.println("i:"+ob1.i+"\nj:"+ob1.j);
		//creating the object2
		A ob2 = new A();
		ob2.i = 10;
		ob2.j = 20;
		//displaying
		System.out.println("i:"+ob2.i+"\nj:"+ob2.j);
		//creating the object3
		A ob3 = new A();
		ob3.i = 30;
		ob3.j = 40;
		//displaying
		System.out.println("i:"+ob3.i+"\nj:"+ob3.j);
		//re-assigning
		ob1.i = 50;
		ob1.j = 60;
		System.out.println("i:"+ob1.i+"\nj:"+ob1.j);
	}

}
