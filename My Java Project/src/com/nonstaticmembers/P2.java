package com.nonstaticmembers;

public class P2 {
	int i;
	void test()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		P2 ob = new P2();
		ob.i=10;
		ob.test();
	}

}
