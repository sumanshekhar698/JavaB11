package com.java.oops.inheritance;

//IPL Player
public class Player {// Inheritance
	String name;
	int age;
	Gender gender;
	int weight;

	boolean isFit() {
		if (this.weight > 60)
			return false;
		return true;
	}
	
	public Player() {
		System.out.println("Player() << ");
	}

	public Player(String name, int age, Gender gender, int weight) {
//		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

}
