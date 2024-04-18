package com.java.oops.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// 1 : Donny
		// 3 : Suman
		// 4 : Mandy
		// K : V
		
		HashMap<Integer, String> map = new HashMap<>();//keys are not duplicates
		map.put(1, "Donny");
		map.put(3, "Suman");

		map.put(4, "Mandy");//Entry
		map.put(1, "Tommy");
		System.out.println(map);
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		
		System.out.println(map.containsKey(2));
		
		if (map.containsKey(1)) {
			System.out.println(map.get(1));

		}
		
		boolean containsValue = map.containsValue("Mandy");
		System.out.println(containsValue);
		
		Set<Integer> keySet = map.keySet();
		Collection<String> values = map.values();
		System.out.println(values);
		
		


		

	}

}
