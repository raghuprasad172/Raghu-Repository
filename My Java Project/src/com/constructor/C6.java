package com.constructor;

public class C6 {
	boolean x;
	double y;
	C6(boolean x, double y)//user defined parameterized constructor
	{
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		C6 ob1 = new C6(false, 2.0);
		C6 ob2 = new C6(true, 3.2);
		C6 ob3 = new C6(false, 4.0);
		System.out.println("x : "+ob1.x+"  y :"+ob1.y);//false 2.0
		System.out.println("x : "+ob2.x+"  y :"+ob2.y);//true 3.2
		System.out.println("x : "+ob3.x+"  y :"+ob3.y);//false 4.0
	}

}
