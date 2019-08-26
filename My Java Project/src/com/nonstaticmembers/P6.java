package com.nonstaticmembers;

public class P6 {
	int i;
	void initialize(int a)
	{
		i=a;
		System.out.println("i:"+a);
	}
	public static void main(String[] args) {
	P6 ob = new P6();
	ob.initialize(10);
	}

}
