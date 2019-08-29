package com.inheritance;

public class World {
	
	public static void main(String[] args) {
		Dog d1 = new Dog(25.0, 30.0, "pug");
		System.out.println("height:"+d1.heigth+"weight:"+d1.weight+"breed:"+d1.name);
		Dog d2 = new Dog(28.0, 32.8, "labrador");
		System.out.println("height:"+d2.heigth+"weight:"+d2.weight+"breed:"+d2.name);
		System.out.println("____________");
		Animal a1 = new Animal(25.0, 30.0);
		System.out.println("height:"+a1.heigth+"weight:"+a1.weight);
		Animal a2 = new Animal(27.0, 45.0);
		System.out.println("height:"+a2.heigth+"weight:"+a2.weight);
	}

}
