package com.sam.javaPracticeProblems;

import java.util.Scanner;

public class StringReversal {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string to be reversed: ");
		String originalString = scanner.nextLine();
		System.out.println(reverseString1(originalString));
		System.out.println(reverseString2(originalString));
	}

	// 1st way
	private static String reverseString1(String originalString) {
		String reversedString = "";
		char[] originalStringArray = originalString.toCharArray();
		for (int i = originalStringArray.length - 1; i >= 0; i--) {
			reversedString = reversedString + originalStringArray[i];
		}
		return reversedString;
	}

	// 2nd way using Java API
	private static String reverseString2(String originalString) {
		StringBuilder stringBuilder = new StringBuilder(originalString);
		return stringBuilder.reverse().toString();
	}

}
