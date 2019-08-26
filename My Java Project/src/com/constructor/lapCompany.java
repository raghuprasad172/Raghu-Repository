package com.constructor;

public class lapCompany {

	public static void main(String[] args) {
		Laptop e1 = new Laptop("Dell", 4, "i3");
		Laptop e2 = new Laptop("lenovo", 4, "i3");
		Laptop e3 = new Laptop("hp", 4, "i7");
		
		System.out.println("name is"+e1.name+"ram size is"+e1.ram+"processor is"+e1.processor);
		System.out.println("name is"+e2.name+"ram size is"+e2.ram+"processor is"+e2.processor);
		System.out.println("name is"+e3.name+"ram size is"+e3.ram+"processor is"+e3.processor);
}
}