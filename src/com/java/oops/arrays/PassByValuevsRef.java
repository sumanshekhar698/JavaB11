package com.java.oops.arrays;

import java.util.Arrays;

public class PassByValuevsRef {

	public static void main(String[] args) {

		int arr[] = { 3, 32, 2};
		
		int x = 89;
		changeInt(x);//value of it
		
		
		change(arr);// pass by ref
		System.out.println(arr.length);
		
		System.out.println(x);
		System.out.println(Arrays.toString(arr));

	}

	static void changeInt(int x) {
		x = 99;

	}

	static void change(int[] arr2) {
		arr2[0] = -999;
		arr2 = null;

	}

}
