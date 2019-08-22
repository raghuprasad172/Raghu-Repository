package com.nonstaticmembers;

public class Company {
	String name;
	int id;
	public static void main(String[] args) {
		//creating a employee1
		employee e1 = new employee();
		// displaying 
		System.out.println("employee name is"+e1.name+"id is"+e1.id);
		//creating a employee2
		employee e2 = new employee();
		//assigning
		e2.name = "raghu";
		e2.id = 1;
		//displaying
		System.out.println("employee name is"+e2.name+"id is"+e2.id);
		//re-assigning
		e1.name = "prasad";
		e1.id = 2;
		System.out.println("employee name is"+e1.name+"id is"+e1.id);
	}

}
