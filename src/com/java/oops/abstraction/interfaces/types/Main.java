package com.java.oops.abstraction.interfaces.types;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird b1 = new Bird() {

			@Override
			public void fly() {
				System.out.println("Flyyyyy");

			}
		};

		Bird b2 = () -> {// Lambda Fn
			System.out.println("Flyyyyy");
		};

	}

}

class Crow implements Bird {

	@Override
	public void fly() {
		System.out.println("Flyyyyy");

	}

}