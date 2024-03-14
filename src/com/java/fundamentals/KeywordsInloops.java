package com.java.fundamentals;

public class KeywordsInloops {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i == 90)
				break;//breaks the loop

			if (i % 5 == 0)
				continue;//skip the current iteration
			System.out.println(i);// mutiples of 5

			// 90 stop the loop

		}

	}

}
