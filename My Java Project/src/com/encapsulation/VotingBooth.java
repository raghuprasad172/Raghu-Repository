package com.encapsulation;

public class VotingBooth {

	public static void main(String[] args) {
		Voter v1 = new Voter(19, 1);
		System.out.println("Age of voter is "+v1.getAge()+"id no is "+v1.getId());
		v1.setAge(28);
		Voter v2 = new Voter(24, 2);
		System.out.println("Age of voter is "+v2.getAge()+"id no is "+v2.getId());
	}

}
