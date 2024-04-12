package com.java.oops.inheritance;

//Object ||Multi Level Inheritance is possible

//Z
//A
//B
//C

class Z {
	int x = 8;

}

//public class A extends Object{//Object class
public class A extends Z {// Object class

	int x = 9;

	public static void main(String[] args) {
		new B().sayX();
		System.out.println();
		new A().sayXOfZ();
	}

	void sayXOfZ() {
		System.out.println(super.x);// IMMEDIATE parernt

	}

}

class B extends A {

	int x = 10;

	void sayX() {
		System.out.println(super.x);// IMMEDIATE parernt
		System.out.println(x);
	}

}
//class C extends B,X {// Multiple Inheritance is not possible

class C extends B {// C is a child of A but not a DIRECT child

}

//class X extends Y{ //Cyclic Inheritance is not possible
//
//}
//
//class Y extends X{
//	
//}
