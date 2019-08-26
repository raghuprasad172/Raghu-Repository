package com.constructor;

public class C2 {
	C2(int a)//parameterized constructor
	{
		System.out.println("from C2()");
	}
	public static void main(String[] args) {
		//create an object
		C2 ob = new C2();//Compile time error
	}

}
