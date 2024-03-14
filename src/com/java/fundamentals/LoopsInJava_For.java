package com.java.fundamentals;

public class LoopsInJava_For {

	public static void main(String[] args) {

		int x = 9;
		// 1 to 100

//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);//...100

//		1. for loop
		int i = 2;
		for (; i <= 1000; i += 2) {// intiation ; conditional ; updation
//			if (i % 2 == 0)
			System.out.println(i);
		}

		System.out.println("i value :: " + i);// scope of variables
		
		
//		for (; ; ) {
//			System.out.println("Hey");
//		}
	}

//	void test() {
//		System.out.println(x);
//	}

}
