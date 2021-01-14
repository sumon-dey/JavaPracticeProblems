// find the longest palindromic substring in a given string
package com.sam.javaPracticeProblemsString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringLongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("The longest palindromic substring is: " + longestPalindromicSubstring(str));
	}

	private static String longestPalindromicSubstring(String str) {
		List<String> palindromeSubstringList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (isPalindrome(str.substring(i, j))) {
					palindromeSubstringList.add(str.substring(i, j));
				}
			}
		}
		String longestString = "";
		for (String s : palindromeSubstringList) {
			if (s.length() > longestString.length()) {
				longestString = s;
			}
		}
		return longestString;
	}

	private static boolean isPalindrome(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		if (str.equals(String.valueOf(charArray))) {
			return true;
		} else {
			return false;
		}
	}

}
