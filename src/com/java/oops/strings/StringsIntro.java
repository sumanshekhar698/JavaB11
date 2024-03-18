package com.java.oops.strings;

public class StringsIntro {

	public static void main(String[] args) {
		// Strings are objects
//		 1. Immutable
//		 2. Mutable

		
		// IMMUTABLE STRINGS
		String str1 = "We are Avengers";// once you dont use new, the memory will be in CP[No Duplicates are Allowed]
		String str2 = new String("We are Avengers");
		String str3 = "We are Avengers";
		String str4 = new String("We are Avengers");

		if (str1 == str2) {// == will not compare values, it compares address
			System.out.println("Equal");
		} else
			System.out.println("Unequal");// Unequal

		if (str1 == str3) {
			System.out.println("Equal");// Equal
		} else
			System.out.println("Unequal");

		if (str2 == str4) {
			System.out.println("Equal");
		} else
			System.out.println("Unequal");// Unequal

		String intern = str1.intern();
		System.out.println(intern);

		String intern2 = "BlackPanther".intern();
		System.out.println(intern2);

		if (str1 == intern) {
			System.out.println("Equal");
		} else
			System.out.println("Unequal");// Unequal

	}

}
