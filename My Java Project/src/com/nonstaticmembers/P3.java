package com.nonstaticmembers;

public class P3 {
	int i;
	void test()//called method
	{
		System.out.println("from test");//from test
		System.out.println(i);//10
		System.out.println("this is"+this);//displays address
		i=20;//global variable
		System.out.println(this.i);//to access global variable
		System.out.println("end of test");
	}
	public static void main(String[] args) {
		System.out.println("from main");//from main
		//creating an object
		P3 ob = new P3();
		//assigning
		ob.i = 10;//initializing the variable
		ob.test();//calling test method
		//displaying
		System.out.println("ob:"+ob);//displays address
		System.out.println("main ends");//main ends
	}

}
