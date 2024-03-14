package com.java.fundamentals;

import java.util.Scanner;

public class MenuDrivenProgramUsingIfElseLadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n 0: Exit \n 1: Coke \n 2: limca \n 3: Pepsi \n 4:Fruit Juice");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("Enjoy your coke");
			} else if (input == 2) {
				System.out.println("Enjoy your Limca");
			} else if (input == 3) {
				System.out.println("Enjoy your Pepsi");
			} else if (input == 4) {
				System.out.println("Enjoy your Fruit Juice");
			} else if (input == 0) {
				System.out.println("Thanks for your service!");
				break;
			} else {
				System.out.println("Invalid input");
			}
		}

	}
}
