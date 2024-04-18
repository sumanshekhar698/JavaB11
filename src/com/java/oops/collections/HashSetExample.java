package com.java.oops.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		List<Integer> list = List.of(3,23,234,4,3,453,35,3,3,45,5,45,45,4,45);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		list.stream().forEach(set::add);
		System.out.println(set);
		
		HashSet<Integer> setOfNum = new HashSet<>();//No duplicates Hashing Algo
		setOfNum.add(54);
		setOfNum.add(51);
		setOfNum.add(51);
		setOfNum.add(4);
		setOfNum.add(9);
		setOfNum.add(9);
		setOfNum.add(98);
		System.out.println(setOfNum);
		setOfNum.stream().forEach(System.out::println);
		
		System.out.println(setOfNum.contains(9));


	}

}
