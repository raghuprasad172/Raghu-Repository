package com.inheritance;

public class A2 extends A {
	static int j=20;
	public static void main(String[] args) {
		A.i=100;
		System.out.println(A.i);//100
		A2.j=200;
	//Cte	System.out.println(A.j);
		System.out.println(A2.j);//200
		
		
	}

}
