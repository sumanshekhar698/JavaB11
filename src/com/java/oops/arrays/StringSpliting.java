package com.java.oops.arrays;

import java.util.Arrays;

public class StringSpliting {// 6.75 *7.25 [7.34] 7.75 8.25 8.75 2019
	
	//Apply off campus  --->  get a call 1500 100--> then interview -->  and fail AMAZon
	
//	HARD Projects 2 nice projects JAVA/JS
	public static void main(String[] args) {
		String str = "Java is Easy language";
		String[] arr = str.split(" ");

		String str2 = "Java,is,Easy,language";
		String[] arr2 = str2.split(",");
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[0]);

	}

}
