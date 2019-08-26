package com.constructor;

public class Wrist {
	
	public static void main(String[] args) {
		Watch w1 = new Watch("Analog", 2000);
		Watch w2 = new Watch("Digital", 3000);
		Watch w3 = new Watch("Quartz", 4000);
		System.out.println("name is"+w1.name+"price is"+w1.price);
		System.out.println("name is"+w2.name+"price is"+w2.price);
		System.out.println("name is"+w3.name+"price is"+w3.price);
	}

}
