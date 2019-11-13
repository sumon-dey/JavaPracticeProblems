package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class PalindromeCheck {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		long enteredNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println(palindromeNumberCheck(enteredNumber));
		System.out.println("Enter the String: ");
		String enteredString = scanner.nextLine();
		System.out.println(palindromeStringCheck(enteredString));
	}

	private static String palindromeNumberCheck(long enteredNumber) {
		long reversedNumber = 0;
		long originalNumber = enteredNumber;
		while (originalNumber > 0) {
			reversedNumber = (reversedNumber * 10) + originalNumber % 10;
			originalNumber = originalNumber / 10;
		}
		return reversedNumber == enteredNumber ? "The number " + enteredNumber + " is a palindrome number"
				: "The number " + enteredNumber + " is not a palindrome number";
	}

	private static String palindromeStringCheck(String enteredString) {
		String newString = "";
		for (int i = enteredString.length() - 1; i >= 0; i--) {
			newString += enteredString.charAt(i);
		}
		return newString.equals(enteredString) ? "The String is Palindrome" : "The String is not Palindrome";
	}

}
