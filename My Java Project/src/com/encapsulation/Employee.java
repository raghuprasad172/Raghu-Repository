package com.encapsulation;

public class Employee {
	String name;
	private double salary;
	int id;
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		if(salary>this.salary)
			this.salary=salary;
	}
	public Employee(String name, double salary, int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
	}

}
