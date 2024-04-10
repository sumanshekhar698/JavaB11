package com.java.static_concept;

public class Student {

	String id;// STD1 STD2
	String name;
	private static int counter = 0;

	public Student(String name) {

		this.id = "STD" + ++counter;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
