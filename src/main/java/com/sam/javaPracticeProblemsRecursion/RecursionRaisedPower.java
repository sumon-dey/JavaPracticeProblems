package com.sam.javaPracticeProblemsRecursion;

public class RecursionRaisedPower {

	public static void main(String[] args) {
		int number = 3;
		int raisedPower = 1;
		System.out.println("The result is: " + raisedToThePowerValueCal(number, raisedPower));
	}

	private static int raisedToThePowerValueCal(int number, int raisedPower) {
		if (raisedPower == 0) {
			return 1;
		} else if (raisedPower == 1) {
			return number;
		} else {
			int result = number * raisedToThePowerValueCal(number, (raisedPower - 1));
			return result;
		}
	}

}
