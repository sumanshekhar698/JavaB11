package com.java.static_concept;

public class Main {

	public static void main(String[] args) {

		Duck.quack();
		Duck duck1 = new Duck("White", false);
		System.out.println(duck1);
		System.out.println(duck1.species);
		duck1.species = "Japanese Duck";
		duck1.quack();

		Duck duck2 = new Duck("Green", true);
		Duck duck3 = new Duck("Brown", false);

		System.out.println(duck2.species);
		System.out.println(duck3.species);
		duck3.species = "Indian Duck";
		System.out.println(duck1.species);
		
		Duck.species = "Bombay Duck";
		System.out.println(Duck.species);// recommended way :: static thngs should ber accessed via class name

	}

}
