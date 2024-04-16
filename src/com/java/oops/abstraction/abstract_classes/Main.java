package com.java.oops.abstraction.abstract_classes;

public class Main {

	public static void main(String[] args) {
		// You cannot create an object DIRECTLY of a abstract class
//		new BankAC1();
		HoneyBank ba1 = new HoneyBank("John", 897, 120, 0);
		System.out.println(ba1);

		BankAC1 ba2 = new BankAC1("Jane", 898, 120, 0) {// Annonymmous Inner Type

			@Override
			int withdrawMoney(int amount) {
				if (amount > balance || amount < 0)
					return -1;
				return balance - amount;
			}

			@Override
			int addMoney(int amount) {
				if (amount > 0)
					balance += amount;
				return balance;
			}
		};
		System.out.println(ba2);

		BankAC1 ba3 = new BankAC1("Jim", 899, 120, 0) {// Annonymmous Inner Type

			@Override
			int withdrawMoney(int amount) {
				if (amount > balance || amount < 0)
					return -1;
				balance -= amount;
				return balance;
			}

			@Override
			int addMoney(int amount) {
				if (amount > 0)
					balance += amount;
				return balance;
			}
		};
		ba3.addMoney(200);
		int withdrawMoney = ba3.withdrawMoney(50);
		
		System.out.println(withdrawMoney);
		System.out.println(ba3);
	}

}
