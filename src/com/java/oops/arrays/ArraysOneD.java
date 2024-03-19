package com.java.oops.arrays;

import java.util.Arrays;

public class ArraysOneD {

	public static void main(String[] args) {
		int[] arr = new int[10];// size 0 and above Integer.MAX_VALUE
//		System.out.println(Integer.MAX_VALUE);

		String arr3  [] = new String[2];
		System.out.println(Arrays.toString(arr3));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * i;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}


	}

}

///  .tiff  .png

// .jpeg .jpg   // .html .htm
// .txt
// .java

// .heic .heif
