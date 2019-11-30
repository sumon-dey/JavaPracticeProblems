package com.sam.javaPracticeProblemsCode1;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the first String: ");
		String string1 = scanner.nextLine();
		System.out.println("Enter the second String: ");
		String string2 = scanner.nextLine();
		System.out.println(anagramCheck1(string1, string2));
		System.out.println(anagramCheck2(string1, string2));
	}

	// Method 1
	private static String anagramCheck1(String string1, String string2) {
		char[] charFromString1 = string1.toLowerCase().toCharArray();
		char[] charFromString2 = string2.toLowerCase().toCharArray();
		Arrays.sort(charFromString1);
		Arrays.sort(charFromString2);
		if (Arrays.equals(charFromString1, charFromString2))
			return "The strings are anagrams.";
		else
			return "The strings are not anagrams.";
	}

	// Method 2
	private static String anagramCheck2(String string1, String string2) {
		char[] charFromString1 = string1.toLowerCase().toCharArray();
		StringBuilder string2Stringbuilder = new StringBuilder(string2.toLowerCase());
		for (char ch : charFromString1) {
			int index = string2Stringbuilder.indexOf("" + ch);
			if (index != -1) {
				string2Stringbuilder.deleteCharAt(index);
			} else {
				return "The strings are not anagrams.";
			}
		}
		return string2Stringbuilder.length() == 0 ? "The strings are anagrams." : "The strings are not anagrams.";
	}

}
