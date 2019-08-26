package com.constructor;

public class World {

	public static void main(String[] args) {
		Animal a1 = new Animal("lion", 4.0, 150);
		Animal a2 = new Animal("tiger", 4.5, 180);
		Animal a3 = new Animal("cheetah", 3.5, 100);
		System.out.println("Animal name is "+a1.name+" height is "+a1.height+"weight is "+a1.weight);
		System.out.println("Animal name is "+a2.name+" height is "+a2.height+"weight is "+a2.weight);
		System.out.println("Animal name is "+a3.name+" height is "+a3.height+"weight is "+a3.weight);
	}

}
