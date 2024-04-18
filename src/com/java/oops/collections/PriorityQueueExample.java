package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

//		PriorityQueue<Integer> queue = new PriorityQueue<>();//MinHeap Data Structure
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());//MaxHeap Data Structure

		queue.add(54);//log n
		queue.add(23);
		queue.add(3);
		queue.add(3);
		queue.add(9);
		queue.add(-88);
		queue.add(-54);
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);


	}

}
