package com.abstraction2;

public class B implements I1 {
	public void test()
	{
		System.out.println("test() of I1 implemented in sub class B");
	}
	public int test1()
	{
		System.out.println("test() of I1 implemented in sub class B");
		return 100;
	}
	public static void main(String[] args) {
		B ob = new B();
		
	}
// B is an implementation of I1	
}
