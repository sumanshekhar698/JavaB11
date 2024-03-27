package com.java.oops.arrays;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {

		test(6, 34, 34, 344, 3, 3);// 1 also 10

	}

	static void test(int x, int... arr) {// ... var args = variable arguments ; they are always the last parameter in
											// the fn
		System.out.println(x);
		System.out.println(Arrays.toString(arr));
	}

}
