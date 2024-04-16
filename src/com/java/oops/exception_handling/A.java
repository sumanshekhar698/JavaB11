package com.java.oops.exception_handling;

public class A {

	public static void main(String[] args) throws InterruptedException {//DEH 
//		try {
			foo1();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

	static void foo1() throws InterruptedException {
		System.out.println("foo1");
		foo2();

	}

	static void foo2() throws InterruptedException {
		System.out.println("foo2");

		foo3();
	}

	static void foo3() throws InterruptedException {
		System.out.println("foo3");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(600);

		}

	}

}
