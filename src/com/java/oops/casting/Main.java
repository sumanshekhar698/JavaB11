package com.java.oops.casting;

public class Main {

	public static void main(String[] args) {
		B b = new B();
		b.bar();
		System.out.println(b.y);
		b.foo();
		System.out.println(b.x);

		A a = b;// Upcasting | Implicit Child to behave like a Parent
//		a.bar();
//		System.out.println(a.y);
		a.foo();
		System.out.println(a.x);

		// Downcasting
		A a2 = new A();
//		B b2 = (B) a2;// Downcasting Explicit its not possible in Java 

		// Just 1 case its possible
		B b3 = (B) a;// its possible when th eobject is already upcasted
		int y = b3.y;
		b3.bar();

//TODO	find a mech where we can safely perform DOWNCASTING //  instaceof
		A a3 = new B();

	}

}

class A {

	int x = 99;

	void foo() {
		System.out.println("foo");
	}

}

class B extends A {
	int y = 100;

	void bar() {
		System.out.println("bar");
	}
}