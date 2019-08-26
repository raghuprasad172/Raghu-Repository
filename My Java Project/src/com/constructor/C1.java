package com.constructor;

public class C1 {
	C1()//user defined non parameterized constructor
	{
		System.out.println("from constructor of C1");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		//creating object
		C1 ob = new C1();
		System.out.println(new C1());//return the address
			
	}

}
