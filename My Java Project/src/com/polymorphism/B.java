package com.polymorphism;

public class B extends A {
	void test()
	{
		System.out.println("from test of B()");
	}
	public static void main(String[] args) {
		A ob = new A();
		ob.test();//from test of A()
		System.out.println("____________-");
		
		ob = new B();//derived type casting
		ob.test();//from test of B()//method overidding
		System.out.println("*************");
		
		A[] array = {new A(), new B(), new A(), new B()};
		//using for loop
		for(int i=0;i<array.length;i++)
		{
			array[i].test();
			System.out.println("______________");
		}
		System.out.println("*************");
		//using for each loop
		for(A a:array)
		{
			//for printing the statements inside the method
			a.test();
		}
	}
	
}
