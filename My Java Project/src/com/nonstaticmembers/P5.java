package com.nonstaticmembers;

public class P5 {
	int a;
	void test()
	{
		int a=300;
		System.out.println(this.a);
		this.a=a;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		//creating a new object1
		P5 ob1 = new P5();
		ob1.a = 20;
		ob1.test();
		//creating a new object2
		P5 ob2 = new P5();
		System.out.println(ob2.a);
		ob2.a = 30;
		System.out.println(ob2.a);
		ob2.test();
	}

}
