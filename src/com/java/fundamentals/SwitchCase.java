package com.java.fundamentals;

import java.util.Scanner;

public class SwitchCase {//

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

//		while (flag) {
		loop1: while (true) {
			System.out.println("\n 0: Exit \n 1: Coke \n 2: limca \n 3: Pepsi \n 4:Fruit Juice");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enjoy your coke");
				break;
			case 2:
				System.out.println("Enjoy your Limca");
				break;
			case 3:
				System.out.println("Enjoy your Pepsi");
				break;
			case 4:
				System.out.println("Enjoy your Fruit Juice");
				break;
			case 0:
				System.out.println("Thanks for your service!");
//				flag = false;
				break loop1;
//				System.exit(77);
			default:
				System.out.println("Invalid input");
				break;
			}

		}

	}

}
