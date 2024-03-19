package com.java.oops.strings;

public class BattleOfStrings {

	public static void main(String[] args) {

		String x = "Tom ";
		StringBuilder sb = new StringBuilder("Tom ");
		long start = System.nanoTime();
		
		for (int i = 0; i < 100000; i++) {
//			x += " and Jerry";
			sb.append(" and Jerry");
		}
		
		
		long end = System.nanoTime();
		System.out.println("Time diff :: " + (end - start));//ns

	}

}
