package com.java.advance.multithreading;

public class SimpleMain {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");

		System.out.println(Thread.currentThread());

		WorkerThread t1 = new WorkerThread();
		t1.setName("t1");
		t1.start();

		WorkerThread t2 = new WorkerThread();
		t2.setName("t2");
		t2.setPriority(10);// 1- 10
		t2.start();

		Thread t3 = new Thread(new Work());
		t3.setName("t3");
		t3.start();

		Thread t4 = new Thread(() -> {

			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + "" + Thread.currentThread());
			}

		});
		t4.setName("t4");
		t4.start();

		for (int i = 0; i < 10; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
		System.out.println("END");

	}

}
