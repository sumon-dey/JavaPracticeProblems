package com.sam.javaPracticeProblemsRecursion;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		System.out.println("Enter the number to find factorial: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("The factorial of " + number + " is: " + factorial(number));
	}

	private static int factorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
