package com.inheritance;

public class F extends E {
	int y;
	public static void main(String[] args) {
		//creating of object for class F
		F f1 = new F();
		//displaying the values
		System.out.println("x: "+f1.x);
		System.out.println("y: "+f1.y);
		//creating of object for class E
		E e1 = new E();
		System.out.println("x: "+e1.x);
		//System.out.println("y: "+e1.y);//CTE
		e1.x=200;
		System.out.println("x: "+e1.x);
		
	}

}
