package com.java.oops.arrays;

import java.util.Arrays;

public class ArrayCloning {

	public static void main(String[] args) {
		int arr[] = { 34, 242, 423, 24, 2, 2, 4 };
		int arr2[] = arr;

		int[] copyOfArr = new int[arr.length];
		int i = 0;
		for (int num : arr) {
			copyOfArr[i++] = num;
		}

		Arrays.fill(arr2, -1);
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(copyOfArr));

		int[] clonedArray = arr.clone();// fresh new copy 1D
		System.out.println(clonedArray);// hashcode
		System.out.println(arr.hashCode());// hashcode
		System.out.println(arr);// hashcode

	}

}
