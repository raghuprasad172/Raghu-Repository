package com.inheritance;

public class Road {

	public static void main(String[] args) {
		Car c1 = new Car("Black ", 1, "Audi");
		System.out.println("Car color:"+c1.color+"car no:"+c1.vn+"car brand"+c1.brand);
		Car c2 = new Car("Blue ", 2, "Bmw");
		System.out.println("Car color:"+c2.color+"car no:"+c2.vn+"car brand"+c2.brand);
		Vehicle v1 = new Vehicle("Black ", 4);
		System.out.println("Car color:"+v1.color+"car no:"+v1.vn);
			
	}
	

}
