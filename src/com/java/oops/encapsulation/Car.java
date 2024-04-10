package com.java.oops.encapsulation;

public class Car {

	// acees modifier

	private int vehichileNo;
	String carName;// default
	private Engine eng;

	public Engine getEng() {
		return eng;
	}

	public int getVehichileNo() {
		return vehichileNo;
	}
	
	

	public void setVehichileNo(int vehichileNo) {
		this.vehichileNo = vehichileNo;
	}

	public Car(int vehichileNo, String carName, Engine eng) {
//		super();
		this.vehichileNo = vehichileNo;
		this.carName = carName;
		this.eng = eng;
	}
	
	private String sayMyEngine() {
		return eng.toString();
	}

	String sayMyCar() {
		return "My car is " + carName + " with a number " + vehichileNo + " with " + sayMyEngine();
	}

}

class Engine {

	int engineNumber;

	public Engine(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + "]";
	}

}
