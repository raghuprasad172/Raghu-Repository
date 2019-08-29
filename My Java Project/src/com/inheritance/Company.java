package com.inheritance;

public class Company {

	public static void main(String[] args) {
		TestEngineer t1 = new TestEngineer("Adi", 120.5, "Selenium1");
		System.out.println("name is:"+t1.name+" id is: "+t1.id+" Salary is:"+t1.salary+" tool is: "+t1.tool);
		TestEngineer t2 = new TestEngineer("raghu", 125.6, "Selenium2");
		System.out.println("name is:"+t2.name+" id is: "+t2.id+" Salary is:"+t2.salary+" tool is: "+t2.tool);
		t1.writesScripts();
		System.out.println("_____________");
		Employee e1 = new Employee("Ram", 56);
		System.out.println("name is:"+e1.name+" id is: "+e1.id+" Salary is:"+e1.salary);
		Employee e2 = new Employee("Krishna", 70);
		System.out.println("name is:"+e2.name+" id is: "+e2.id+" Salary is:"+e2.salary);
		e1.work();
 }

}
