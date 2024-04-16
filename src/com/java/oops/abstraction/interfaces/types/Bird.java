package com.java.oops.abstraction.interfaces.types;

@FunctionalInterface
public interface Bird {// ONLY 1 abstract method

	void fly();
//	void swim();

	static void foo() {
		System.out.println("Foo");
	}

	default void bar() {
		System.out.println("Bar");
	}

}
