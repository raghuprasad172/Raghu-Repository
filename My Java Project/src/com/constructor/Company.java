package com.constructor;

public class Company {
	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.name="raghu";
		e1.id=7;
		e1.salary=100.0;
		System.out.println("name is"+e1.name+"id is"+e1.id+"salary is"+e1.salary);
		Employ e2 = new Employ("prasad", 10, 200.0);
		System.out.println("name is"+e2.name+"id is"+e2.id+"salary is"+e2.salary);
		
		
	}

}
