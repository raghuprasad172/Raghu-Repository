package com.abstraction;

public class World {

	public static void main(String[] args) {
//		Dog d1 = new Dog();
//		d1.talks();//functionality is provided by concrete class dog
//		System.out.println("______________");
//		Cat c1 = new Cat();
//		c1.talks();//functionality is provided by concrete class cat
//		System.out.println("______________");
		Animal a;
		a = new Dog();
		a.talks();//functionality is provide by abstract Animal class
		a = new Cat();
		a.talks();//functionality is provide by abstract Animal class
				
	}

}
