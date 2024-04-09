package com.java.oops.polymorphism;

public class ShapePolymorphic {

	// Polymorphism in Java
	// 1. Complile Time, Method Overloading is resolved while compliation itself
	// * a) same name for the overlaoded fn
//	* b) some unique factor
//	     No of paramters
//		Type of Parameters
//		Posn of paramters

	// 2. Runtime, Method Overriding

	
	
	//area is overloaded
	int area(int side) {
		return side * side;
	}

	int area(int length, int breadth) {
		return length * breadth;
	}

	double area(float radius) {
//		return 3.14159f * radius *radius;
		return Math.PI * radius * radius;
	}

	float area(int base, float height) {
		return .5f * base * height;
	}

	float area(float height, int base) {//  ||gram
		return base * height;
	}

}
