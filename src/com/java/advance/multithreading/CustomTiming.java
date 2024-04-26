package com.java.advance.multithreading;

public class CustomTiming {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");
		System.out.println(Thread.currentThread().getState());

		WorkerThread t1 = new WorkerThread();
		System.out.println(t1.getState());

		t1.setName("t1");
		t1.start();
		
		System.out.println(t1.getState());
		t1.join();
		System.out.println(Thread.currentThread().getState());

		System.out.println("END");
		System.out.println(Thread.currentThread().getState());


	}

}
