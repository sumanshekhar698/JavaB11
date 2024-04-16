package com.java.oops.abstraction.abstract_classes;

public class HoneyBank extends BankAC1 {

	public HoneyBank(String name, long acNo, int ifscCode, int balance) {
		super(name, acNo, ifscCode, balance);
		// TODO Auto-generated constructor stub
	}

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
}
