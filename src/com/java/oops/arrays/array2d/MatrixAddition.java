package com.java.oops.arrays.array2d;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {
//		int[][] mat1 = {};//2D matrix is having 0 1D array
		int[][] mat1 = { 
				{ 2, 5, -1 }, 
				{ 3, 66, 89 } 
				};//2*3
		
		int[][] mat2 = { 
				{ 232, 51, -1 }, 
				{ -33, 6, 8 } 
				};//2*3
		
		//Matrix Addition 
//		TODO Matrix Subtraction also Matrix Multiplication
		
		if(mat1.length == mat2.length && mat1[mat1.length-1].length ==  mat2[mat2.length-1].length ) {
			int [][] result = new int[mat1.length][mat1[mat1.length-1].length];
			
			for (int i = 0; i < result.length; i++) {//addition
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
			
			for (int i = 0; i < result.length; i++) {//printing
				System.out.println(Arrays.toString(result[i]));
			}
		}else {
			System.out.println("Matrix Addition not possible");
		}
		

	}

}
