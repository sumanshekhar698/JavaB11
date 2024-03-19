package com.java.oops.strings;

public class HW {

	public static void main(String[] args) {
		String str = "  ";
		str = null;
		if (str != null) {
			System.out.println(str.isBlank());
			System.out.println(str.isEmpty());// Apache Commons
		}
	}

}
