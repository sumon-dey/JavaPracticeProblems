// Reverse a String using Recursion
package com.sam.javaPracticeProblemsString;

import java.util.Scanner;

public class StringReversalUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String originalString = scanner.nextLine();
		reverseString(originalString);
	}

	public static void reverseString(String str) {
		if (str == null || str.length() <= 1) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			reverseString(str.substring(0, str.length() - 1));
		}
	}

}
