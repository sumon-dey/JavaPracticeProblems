// find the length of the longest substring without repeating characters
package com.sam.javaPracticeProblemsString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		List<String> substringList = extractAllSubstrings(str);
		List<String> substringListWithoutRepeatingCharacters = extractSubstringsWithoutRepeatingCharacter(
				substringList);
		String longestSubstringWithoutRepeatingCharacters = extractLongestSubstringWithoutRepeatingCharacters(
				substringListWithoutRepeatingCharacters);
		System.out.println("Result: " + longestSubstringWithoutRepeatingCharacters);
	}

	private static List<String> extractAllSubstrings(String str) {
		List<String> substringList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				substringList.add(str.substring(i, j));
			}
		}
		return substringList;
	}

	private static List<String> extractSubstringsWithoutRepeatingCharacter(List<String> substringList) {
		List<String> substringListWithoutRepeatingCharacters = new ArrayList<>();
		for (String str : substringList) {
			if (!hasRepeatingCharacter(str)) {
				substringListWithoutRepeatingCharacters.add(str);
			}
		}
		return substringListWithoutRepeatingCharacters;
	}

	private static String extractLongestSubstringWithoutRepeatingCharacters(
			List<String> substringListWithoutRepeatingCharacters) {
		String longestString = "";
		for (String str : substringListWithoutRepeatingCharacters) {
			if (str.length() > longestString.length()) {
				longestString = str;
			}
		}
		return longestString;
	}

	private static boolean hasRepeatingCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}

}
