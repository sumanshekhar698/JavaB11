package com.java.oops.strings;

public class StringMethods {

	public static void main(String[] args) {// Strings are IMMUABLE

		String str1 = "  We are Avengers   ";
		System.out.println(str1.length());// Method
		str1 = str1.trim();
		System.out.println(str1);

		String str2 = str1.toUpperCase();
		System.out.println(str2);

		System.out.println(str2.toLowerCase());
		System.out.println(str2.charAt(str2.length() - 1));
		System.out.println(str2.substring(3));
		System.out.println(str2.substring(3, 9));// stating index is inclusive, ending is exclusive

		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());// isEmpty() vs isBlank()

		System.out.println(str2.contains("ARE"));
		String str3 = "hey";
		String str4 = "hey";
		
		String str5 = new String(str3);
		String str6 = "Hey";
		if (str3.equals(str5)) {
			System.out.println("Equal");
		} else {
			System.out.println("False");

		}

		if (str3.equalsIgnoreCase(str6)) {
			System.out.println("Equal");
		} else {
			System.out.println("False");

		}
		
		System.out.println(str2.startsWith("WE"));

	}

}
