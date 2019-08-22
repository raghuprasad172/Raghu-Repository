package com.nonstaticmembers;

public class Rider {

	public static void main(String[] args) {
		//creating a rider
		Vehicle r1 = new Vehicle();
		//displaying
		System.out.println("Vehicle name is"+r1.name+"colour is"+r1.colour+"speed is"+r1.speed);
		//creating a rider2
		Vehicle r2 = new Vehicle();
		//assigning
		r2.name = "pulsar";
		r2.colour = "Black";
		r2.speed = 60;
		//displaying
		System.out.println("Vehicle name is"+r2.name+"colour is"+r2.colour+"speed is"+r2.speed);
		//re-assigning
		r1.name = "Rx";
		r1.colour = "Red";
		r1.speed = 50;
		//displaying
		System.out.println("Vehicle name is"+r1.name+"colour is"+r1.colour+"speed is"+r1.speed);
	}

}
