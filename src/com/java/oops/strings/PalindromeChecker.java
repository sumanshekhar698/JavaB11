package com.java.oops.strings;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		/// MADAM RADAR DAD MOM
//		String str2 = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			str2 += str.charAt(i);
//		}
//
//		System.out.println(str2);
//		if (str2.equalsIgnoreCase(str)) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}

		System.out.println(new StringBuilder(str).reverse().toString().equalsIgnoreCase(str));
		// If you have a case where you are modiying a String a lot of Times
		// StringBuilder [File Handling]

	}

}
