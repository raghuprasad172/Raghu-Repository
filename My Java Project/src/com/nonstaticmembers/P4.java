package com.nonstaticmembers;

public class P4 {
	int i;//global variable
	void test()//method
	{
		int i=30;//local variable
		System.out.println(i);//local variable
		System.out.println(this.i);//global variable
	}
	public static void main(String[] args) {
		//creating new object1
		P4 ob1 = new P4();
		//calling void test
		ob1.test();
		//creating new object2
		P4 ob2 = new P4();
		//assigning value
		ob2.i = 20;
		//calling void test
		ob2.test();
	}

}
