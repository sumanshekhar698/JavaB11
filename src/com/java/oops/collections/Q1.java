package com.java.oops.collections;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q1 {

	public static void main(String[] args) {
		// To filter only the even numbers of a list and store in a set
		List<Integer> list = List.of(23, 23, 32, 23, 423, 4, 43, 43, 43, 345, 534, 534, 5, 534);
		Set<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
		System.out.println(collect);

	}

}
