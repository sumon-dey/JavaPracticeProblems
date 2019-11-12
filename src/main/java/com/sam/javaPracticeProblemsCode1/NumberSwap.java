package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class NumberSwap {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the two numbers to be swapped: ");
		System.out.println("Enter the first number: ");
		int enteredNumber1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the second number: ");
		int enteredNumber2 = scanner.nextInt();
		System.out.println("Before swapping: \nFirst Number: " + enteredNumber1 + ", Second Number: " + enteredNumber2);
		System.out.println(swapNumber(enteredNumber1, enteredNumber2));
	}

	private static String swapNumber(int enteredNumber1, int enteredNumber2) {
		enteredNumber1 += enteredNumber2;
		enteredNumber2 = enteredNumber1 - enteredNumber2;
		enteredNumber1 -= enteredNumber2;
		return "After swapping: \nFirst Number: " + enteredNumber1 + " ,Second Number: " + enteredNumber2;
	}

}
