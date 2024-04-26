package com.java.advance.multithreading;

public class MainPM {

	public static void main(String[] args) {

		PrimeMinister pm = PrimeMinister.declarePm("Mr Modi", 65);

		System.out.println(pm);
		System.out.println(pm.hashCode());

		PrimeMinister pm2 = PrimeMinister.declarePm("Rahul Gandhi", 50);

		System.out.println(pm2.hashCode());
	}

}
