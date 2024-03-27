package com.java.oops.arrays.array2d;

public class Jagged2DArray {

	public static void main(String[] args) {
		int[][] matrix = { 
				{ 2, 5, -1, 45 }, 
				{ 3, 66, 66 },
				{ 3, 626, 839, 66 } };//Jagged/Unsymetric 2D array becaus eeache 1D array is not having same elements

		
		for (int i = 0; i < matrix.length; i++) {//1D
			for (int j = 0; j < matrix[i].length; j++) {//elements of that 1D
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
