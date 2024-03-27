package com.java.oops.arrays.array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Simple2DArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows = scanner.nextInt();
		System.out.println("Enter Columns");
		int columns = scanner.nextInt();
		int[][] matrix = new int[rows][columns];// you have 3 1D array each 1D array will have 2 elements
//		System.out.println(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
