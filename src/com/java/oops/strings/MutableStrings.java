package com.java.oops.strings;

public class MutableStrings {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hey");
		StringBuffer sbb = new StringBuffer("Hey");// this is preferreed in MT
		sbb.reverse();

		sb.append(" Bro");

		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);

	}

}
