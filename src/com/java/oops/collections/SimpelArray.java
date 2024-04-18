package com.java.oops.collections;

import java.util.Arrays;

public class SimpelArray {

	public static void main(String[] args) {
		int[] arr = new int[5];//
		// Not expandable
		// Homogenous
		// Giod Methods
//		

		// Can array store Heteronenous data? : No
		
//		"Tommy", 1

		String str = "Sumu";
		Object obj = str;//Implicity Upcasting
		
		Integer x = 9;
		Object[] objArr = new Object[5];
		objArr[0] = "Tommy";//Implicit Upcasting
		objArr[1] = 1;//Auto Boxing
		objArr[2] = false;//Auto Boxing
		System.out.println(Arrays.toString(objArr));

	}

}
