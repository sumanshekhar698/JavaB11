package com.java.advance.multithreading;

public class WorkerThread extends Thread {//Worker

	@Override
	public void run() {//Work
		System.out.println(Thread.currentThread().getState());

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "" + Thread.currentThread());
		}
	}

}
