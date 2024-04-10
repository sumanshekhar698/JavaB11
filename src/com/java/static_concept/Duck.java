package com.java.static_concept;

public class Duck {

	// static variables
	static String species;// static is a class level thing , not a object level
	// static entities are common for all the objects of the same class

	// instance/objects variables
	String featherColor;
	boolean canFly;

	static {// you cannot access non static things in a static context DIRECTLY
		System.out.println("static block <1< ");
		species = "Native Duck";
//		System.out.println(featherColor);
	}

	{
		System.out.println("normal block <1< ");
		System.out.println(featherColor);
		System.out.println(species);//static things can be access anywhere
	}

	{
		System.out.println("normal block <2< ");
	}

	public Duck(String featherColor, boolean canFly) {
		System.out.println("Duck Constructor (String featherColor, boolean canFly)");
		this.featherColor = featherColor;
		this.canFly = canFly;
	}

	static {// you cannot access non static things in a static context DIRECTLY
		System.out.println("static block <2< ");
//		System.out.println(featherColor);
	}

	static void quack() {
		System.out.println("Quack Quack>>");
//		System.out.println(featherColor);
		System.out.println(species);
	}

//	@Override
	public String toString() {
		return "Duck [featherColor=" + featherColor + ", canFly=" + canFly + "]";
//		return "Dumb Duck";
	}

}
