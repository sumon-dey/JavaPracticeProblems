package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class PrimeNumberCheck {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to check whether it is a Prime number or not: ");
		int enteredNumber = scanner.nextInt();
		System.out.println(checkPrime(enteredNumber));
	}

	private static String checkPrime(int number) {
		int temp;
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			temp = number % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			return "The number is a Prime Number";
		} else
			return "The number is not a Prime Number";
	}

}
