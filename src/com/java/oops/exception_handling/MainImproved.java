package com.java.oops.exception_handling;

import java.util.Scanner;

public class MainImproved {
	static int count = 0;

	public static void main(String[] args) {
		// Errors
		// Exceptions

		System.out.println("START");
//		ss Compilation Error

		int arr[] = { 1, 2, 3, 4 };

		try (Scanner sc = new Scanner(System.in);) {// child of AutoCloseable
			int num = sc.nextInt();
			System.out.println(arr[8 / num]);
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {// java 8 onwards
			e.printStackTrace();
			System.out.println(e);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

//		try

//		try catch
//		try catch catch catch 
//		try catch(|) catch
//		 + finally
//		try with resource

//		foo();

		System.out.println("END");

	}

	static void foo() {// Recursion
		System.out.println(++count);
		foo();
	}

}
