package com.java.oops.arrays;

import com.java.oops.intro.IcecreamOld;

public class WrapperClasses {

	public static void main(String[] args) {
		int x = 9;// its a primitive var
		System.out.println(x);
		Integer num = new Integer(x);// Wrapper class of int

		Integer num1 = x;// Autoboxing via Wrapped class
		num1 = 99;// Autoboxing

		int y = num1;// AutoUnBoxing

		System.out.println(num);
		System.out.println(num1);
		System.out.println(y);

		Boolean isEasy = true;
		Character xh = 'j';

		int arr[] = { 44, 234, 234, 4, 43, 43 };
		Integer arr2[] = { 44, 234, 234, 4, 43, 43 };

		String arr3[] = new String[5];
		IcecreamOld[] arr4 = new IcecreamOld[4];
	}

}
