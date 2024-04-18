package com.java.oops.collections;

import java.util.HashMap;

public class Q2 {

	public static void main(String[] args) {
		String str = "watErMelOn"; // calculate a freq map :: CaseInsesitive

		str = str.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		System.out.println(map);

	}

}
