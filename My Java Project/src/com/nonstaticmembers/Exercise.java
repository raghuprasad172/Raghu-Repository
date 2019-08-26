// 26-8 create a class name the class as exercise inside the class create one static and non static variable 
//both area of type integer type.
package com.nonstaticmembers;

public class Exercise {
	static int a;//static global variable
	int b;//non static global variable
	void test()
	{
		//accessing static inside non static context
		System.out.println(a);//20//directly
		Exercise.a=20;
		//accessing non static member from non static context
		System.out.println(b);//10//directly
		System.out.println(this.b);//10//using this keyword
	}
	public static void main(String[] args) {
		//accessing static member in static context
		System.out.println(a);//10//directly using member name
		Exercise.a=20;
		System.out.println(Exercise.a);//20//using class name
		//accessing non static inside static context
		//creating an object
		Exercise ob1 = new Exercise();
		//assigned with a value
		ob1.b=10;
		//calling method
		ob1.test();
		System.out.println(ob1.a);//20
	}

}
