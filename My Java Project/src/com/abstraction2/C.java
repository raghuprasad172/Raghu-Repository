package com.abstraction2;

public class C implements I3 {

	@Override
	public void test1() {
		System.out.println("test1() of I2 implemented in C");
	}

	@Override
	public void test2() {
		System.out.println("test2() of I3 implemented in C");
	}
}
