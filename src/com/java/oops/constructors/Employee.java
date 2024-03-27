package com.java.oops.constructors;

public class Employee {
	int id;
	String name;

	// Constructor
//	Employee()  default constructor

	// Constructor is overloaded

	// Explicit
	// Non parameterised
	Employee() {// no return type
//		this(); dont do looping chains
		System.out.println("Employee()");
	}

	public Employee(int id, String name) {// helping to create objects and asiign values to instance variables
		this(name);// constructor chaining should always be the 1st statement
		System.out.println("Employee(int id, String name)");
		this.test();
//		System.out.println(id);

		// Shadow Problem
		this.id = id;// this is a keyword that points to the current objet
		this.name = name;
	}

	// 1st
	// no of params
	// type of param
	// param posn

	public Employee(String name) {
		this();
		System.out.println("Employee(String name)");
//		this.id = -1;
		this.name = name;
	}
	
	void test(){
		System.out.println("testing");
	}
	
	Employee testEmp() {
		System.out.println(this);
		return this;
	}

}
