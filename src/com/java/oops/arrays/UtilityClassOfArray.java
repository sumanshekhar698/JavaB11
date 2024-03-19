package com.java.oops.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UtilityClassOfArray {

	public static void main(String[] args) {
		int arr[] = { 34, 242, 423, 24, 2, 2, 4, 242, 234, 2, 24, 234 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);// ASC
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, -1);
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 2, 6, 999);//poartial fill
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
