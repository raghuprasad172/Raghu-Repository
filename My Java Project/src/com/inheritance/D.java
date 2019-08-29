package com.inheritance;

public class D extends C {
	static int j=20;
	public static void main(String[] args) {
		C.i=100;
		System.out.println(D.i);
		D.j=150;
		System.out.println(D.j);
		
		
	}

}
