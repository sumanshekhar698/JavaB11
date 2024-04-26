package com.java.advance.multithreading;

public class Work implements Runnable {// Work

	@Override
	public void run() {// Work
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "" + Thread.currentThread());
		}
	}

}
