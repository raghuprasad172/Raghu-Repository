package com.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee("Dingu", 1000.0, 2);
		System.out.println("salary of "+e1.name+"is "+e1.getSalary()+"and id is "+e1.id);
		e1.setSalary(2000);
		System.out.println("salary of"+e1.name+"is set as "+e1.getSalary());
	}

}
