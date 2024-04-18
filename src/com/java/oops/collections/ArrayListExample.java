package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Sumu");
		list.add(new YHills());
		list.add(1);
		System.out.println(list);

		// collections can only hold Objects
		ArrayList<Integer> listOfInteger = new <Integer>ArrayList();// Generics
		listOfInteger.add(5);
		listOfInteger.add(15);
		listOfInteger.add(5);
		listOfInteger.add(50);
//		listOfInteger.add(false);
		System.out.println(listOfInteger);

//		for (int i = 0; i < listOfInteger.size(); i++) {//HORRIBLE WAY to iterate collection
//			listOfInteger.add(i);
//			System.out.print(listOfInteger.get(i) + " ");
//		}

		for (Integer num : listOfInteger) {// 2 iterate from back
//			listOfInteger.add(num);
			System.out.print(num + " ");
		}

		System.out.println();
		Iterator<Integer> itr = listOfInteger.iterator();
		while (itr.hasNext()) {// [5, 15, 5, 50]
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		// TODO User Iterator to iterate in reverse
//		 | <-- [5, 15, 5, 50]
		listOfInteger.stream().forEach(System.out::println);//:: method ref
		
		ArrayList<Integer> list2 = new ArrayList<>() {{
			add(665);
			add(90);
		}};
		
		List<Integer> list3 = List.of(5,6,4,2,4,4);//Its a ImmutableColection
//		list3.addAll(list2);
		
		listOfInteger.addAll(list3);
		System.out.println(listOfInteger);
		
		listOfInteger.add(3, 44);
		System.out.println(listOfInteger);//LL
		
		boolean contains = listOfInteger.contains(1000);
		System.out.println(contains);
		
		//Collections
		Collections.sort(listOfInteger);//to only try on definde data types
		System.out.println(listOfInteger);
		
		Collections.sort(listOfInteger,Collections.reverseOrder());
		System.out.println(listOfInteger);
		
		
		Collections.shuffle(listOfInteger);
		System.out.println(listOfInteger);
		

	}

}

class YHills {

}