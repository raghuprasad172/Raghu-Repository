package com.abstraction2;
//derived type casting with inheritance
public class MainClass2 {
	
	public static void main(String[] args) {
		I4 ob;
		ob = new A1();//up-casting
		ob.test1();
		((I5)ob).test2();//explicit type casting
		
		
	}
}
