package com.java.oops.exception_handling;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age");
		int age = sc.nextInt();
		try {
			checkAge(age);
		} catch (InvalidVotingAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void checkAge(int age) throws InvalidVotingAge {

		if (age < 0 || age > 150)
			throw new InvalidVotingAge("Age in Invalid");
		else if (age < 18)
			throw new InvalidVotingAge("Underage");

	}

}

class InvalidVotingAge extends Exception {

	public InvalidVotingAge(String message) {
		super(message);
	}

}
