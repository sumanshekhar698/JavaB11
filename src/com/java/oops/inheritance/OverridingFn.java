package com.java.oops.inheritance;

public class OverridingFn {
	public static void main(String[] args) {
		new Child().doMath();
	}

}

class Parent {

	int x = 9;
	private int y = 10;//private things are not inherited

	void doMath() {
		System.out.println(x * x);
	}

	final boolean isOdd() {
		return !(x % 2 == 0);
	}

	private boolean checkPrime(int y) {// TODO

		return false;
	}

}
//Object
//Parent
//Child


final class Child extends Parent {

//	isOdd() is a inherited Method
//	boolean isOdd() { //finakl methods cannot be overriden
//		return false;
//	}


	@Override // Runtime Polymorphism = Method Overriding
	void doMath() {// Overriden Method
//		super.doMath();
	
		System.out.println(Math.sqrt(x));
	}

	boolean isEven() {// Special Method
		return (x % 2 == 0);
	}
}

//class GrandChild extends Child{//final class cannot be extended
//	
//}
