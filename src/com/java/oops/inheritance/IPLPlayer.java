package com.java.oops.inheritance;

public class IPLPlayer extends Player {

	String teamName;
	int jerseyNumber;
	boolean isCaptain;

	public IPLPlayer() {
//		super();
		// parent constructor
		System.out.println(" IPLPlayer() << ");
	}

	public IPLPlayer(String name, int age, Gender gender, int weight, String teamName, int jerseyNumber,
			boolean isCaptain) {
//		this();
		
		super(name, age, gender, weight);// super is to used to refer the IMM<EDIATE parent
		this.teamName = teamName;
		this.jerseyNumber = jerseyNumber;
		this.isCaptain = isCaptain;
	}

	@Override
	public String toString() {
		return "IPLPlayer [teamName=" + teamName + ", jerseyNumber=" + jerseyNumber + ", isCaptain=" + isCaptain
				+ ", name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight + "]";
	}

}
