// check whether a given String is palindrome or not
package com.sam.javaPracticeProblemsString;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(checkPalindrome(str) ? "Palindrome" : "Not Palindrome");
	}

	private static boolean checkPalindrome(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char c = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = c;
		}
		return new String(charArray).equals(str) ? true : false;
	}

}
