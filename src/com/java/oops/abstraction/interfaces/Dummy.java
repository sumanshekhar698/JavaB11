package com.java.oops.abstraction.interfaces;

//interface can extend n  number of interface
// class can extends a concrete as well as abstract class
// abstract class can extends abstract classes
// class can extends AS well as implement;

public interface Dummy extends X, Y {

}

interface X {
	void foo();
}

interface Y {
	void bar();
}

class Foo extends ChildrenBank implements X, Y, Dummy {

	public Foo(String name, long acNo, int ifscCode, int balance) {
		super(name, acNo, ifscCode, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub

	}

}