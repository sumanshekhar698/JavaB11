package com.java.oops.inheritance;

public class Main {

	public static void main(String[] args) {
//		Gender gender = new Player().gender;
//		System.out.println(gender);

		IPLPlayer rohitSharma = new IPLPlayer();
		rohitSharma.name = "Rohit Sharma";
		rohitSharma.age = 37;
		rohitSharma.teamName = "MI";
		rohitSharma.gender = Gender.MALE;
		rohitSharma.isCaptain = false;
		rohitSharma.jerseyNumber = 45;
		rohitSharma.weight = 75;
		System.out.println(rohitSharma);
		System.out.println(rohitSharma.isFit());

	}

}
