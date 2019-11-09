package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class PalindromeNumberCheck {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		long enteredNumber = scanner.nextLong();
		System.out.println(palindromeCheck(enteredNumber));
	}

	private static String palindromeCheck(long enteredNumber) {
		long reversedNumber = 0;
		long originalNumber = enteredNumber;
		while (originalNumber > 0) {
			reversedNumber = (reversedNumber * 10) + originalNumber % 10;
			originalNumber = originalNumber / 10;
		}
		return reversedNumber == enteredNumber ? "The number " + enteredNumber + " is a palindrome number"
				: "The number " + enteredNumber + " is not a palindrome number";
	}

}
