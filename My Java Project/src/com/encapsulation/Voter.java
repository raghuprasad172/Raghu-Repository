package com.encapsulation;

public class Voter {
	private int age;
	private int id;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) {
		if(age>18)
		{
			this.age=age;
		}
		else {
			System.out.println("Entered data is not valid");
		}
	}
	public int getId()
	{
		return id;
	}
	Voter(int age, int id)
	{
		this.age=age;
		this.id=id;
	}
}
	

