package com.constructor;

public class C5 {
	int i;
	C5()//user defined non parameterized constructor
	{
		i=10;
	}
	public static void main(String[] args) {
		C5 ob1 = new C5();
		C5 ob2 = new C5();
		C5 ob3 = new C5();
		System.out.println("i value for 1st object is"+ob1.i);
		System.out.println("i value for 2nd object is"+ob2.i);
		System.out.println("i value for 3rd object is"+ob3.i);
	}

}
