package com.inheritance;

public class Y extends X {
	static int j=20;
	static
	{
		System.out.println(i);//10
		System.out.println(j);//20
		System.out.println("sib of y");
	}

	public static void main(String[] args) {
		System.out.println("from main of y");
	}

}
