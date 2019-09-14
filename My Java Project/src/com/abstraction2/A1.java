package com.abstraction2;

public class A1 implements I4,I5 {

	@Override
	public void test1() {
		System.out.println("from test() of I4 implemented in A1");
	}

	@Override
	public void test2() {
		System.out.println("from test() of I5 implemented in A1");
	}
	 
}
