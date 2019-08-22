package com.nonstaticmembers;

public class School {

	public static void main(String[] args) {
		//creating student1
		Student s1 = new Student();
		//display
		System.out.println("student name is"+s1.name+"marks is"+s1.marks);
		//creating student2
		Student s2 = new Student();
		//assigning
		s2.name = "raghu";
		s2.marks = 75;
		//display
		System.out.println("student name is"+s2.name+"marks is"+s2.marks);
		//re-assigning
		s1.name = "prasad";
		s1.marks = 50;
		//display
		System.out.println("student name is"+s1.name+"marks is"+s1.marks);
	}

}
