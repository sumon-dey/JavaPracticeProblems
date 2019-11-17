package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class Factorial {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int enteredNumber = scanner.nextInt();
		System.out.println("The factorial of " + enteredNumber + " is: " + factorialFirstWay(enteredNumber));
		System.out.println("The factorial of " + enteredNumber + " is: " + factorialSecondWay(enteredNumber));
	}

	private static int factorialFirstWay(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorialFirstWay(number - 1);
	}

	private static int factorialSecondWay(int number) {
		if (number == 0) {
			return 1;
		}
		int product = 1;
		for (int i = number; i >= 1; i--) {
			product = product * i;
		}
		return product;
	}

}
