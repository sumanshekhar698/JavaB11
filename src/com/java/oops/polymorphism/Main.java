package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		System.out.println(shape.circle(10));
		System.out.println(shape.triangle(10, 5));
		
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.area(8.9f));
		System.out.println(shapePolymorphic.area(10.0f, 5));
		
		
		System.out.println();//println is overloaded
		System.out.println(7);
		System.out.println("Hey");
	}

}
