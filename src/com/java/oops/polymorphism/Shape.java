package com.java.oops.polymorphism;

public class Shape {

	int square(int side) {
		return side * side;
	}

	int rectangle(int length, int breadth) {
		return length * breadth;
	}

	double circle(float radius) {
//		return 3.14159f * radius *radius;
		return Math.PI * radius * radius;
	}

	float triangle(int base, float height) {
		return .5f * base * height;
	}

	float parallelogram(int base, float height) {
		return base * height;
	}

}
