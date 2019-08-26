package com.constructor;

public class C4 {
	static int i;//static global variable
	int j;//non static global variable
	C4()///constructor is a non static context
	{
		i=10;//accessing static member directly
		System.out.println(i);//10//accessing static member directly
		System.out.println(C4.i);//10//accessing static using class name
		j=20;
		System.out.println(j);//20//directly
		System.out.println(this.j);//20//accessing non static number using this
		System.out.println(this);//address
	}
	
	public static void main(String[] args) {
		//creating object to access non static members
		C4 ob1 = new C4();
	}

}
