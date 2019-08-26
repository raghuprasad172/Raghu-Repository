package com.constructor;

public class C3 {
	C3() //user defined non parameterized
	{
		System.out.println("C3() constructor");
	}
	C3(int i) //user defined parameterized
	{
		System.out.println("C3(int) constructor");
	}
	public static void main(String[] args) {
		C3 ob = new C3();
		System.out.println("+++++++++++");
		C3 ob1 = new C3(10);
	}

}
