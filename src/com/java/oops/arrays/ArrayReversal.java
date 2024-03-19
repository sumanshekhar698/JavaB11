package com.java.oops.arrays;

import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		int[] arr = { 32, 32, 4, 3, 2, 4, 42, 44, 2324, 4, 24, 42, 42 };// hard coding an array
		arr[0] = 99;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

//		int[] arr2 = new int[arr.length];//n EXTRA SPACE
//		int counter = 0;
//		for (int i = arr2.length - 1; i >= 0; i--, counter++) {//LOOPING 1 time
//			arr2[counter] = arr[i];
//
//		}
//		
//		System.out.println(Arrays.toString(arr2));

		int i = 0, j = arr.length - 1;

		while (i <= j) {//LOOPING 1/2 time and CONSTANT EXTRA SPACE
			//SWAPPING
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;

		}
		
		System.out.println(Arrays.toString(arr));

	}

}
