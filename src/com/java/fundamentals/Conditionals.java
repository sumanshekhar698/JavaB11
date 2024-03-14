package com.java.fundamentals;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 98;

//		if (x % 2 == 0) {
//			System.out.println("Even");
//		} else if (x < 100) {
//			System.out.println("x is <100");
//		} else {
//			System.out.println("ODd");
//		}

//		if (x % 2 == 0) {
//			System.out.println("Even");
//		}
//		
//		if (x < 100) {
//			System.out.println("x is <100");
//		} else {
//			System.out.println("ODd");
//		}

		if ((x % 2 == 0) && x < 100) {//||
			System.out.println("Even and x is <100");
		} else {
			System.out.println("ODd");
		}

	}

}
