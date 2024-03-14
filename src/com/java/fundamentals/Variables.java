package com.java.fundamentals;

public class Variables {// C1: class name should be PascalCase TomAndJerry

	public static void main(String[] args) {// keywords

//		int void = 909;//R2: you caanot have reserved words as variable names
//		int 9 = 909;//R3: you caanot have variables name starting with num

//		Primitive Variables

//		integers
//		bit ? 0 or 1
		byte a = 6;// 2s complement
		short b = 88;
		int c = 8;
		long d = 44;

//		float
		float pi = 3.14159F;// IEEE
		double valueOfPi = 3.14159;

//		character
		char ch = 'x';
		System.out.println((int) ch);
		System.out.println((char) 240);
		char rupee = '₹';
		System.out.println(rupee);
		System.out.println((int) rupee);

//		boolean
		boolean isJavaEasy = true;
		isJavaEasy = false;

		int var = 0x89ABC6;
		System.out.println(var);

	}
//	C2:  variblesName, fn/method names --> camelCase

}
