// print the output after removing the duplicate characters from a String
package com.sam.javaPracticeProblemsString;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicateCharacterRemoval {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String originalString = scanner.nextLine();
		stringDuplicateCharacterRemoval(originalString);
	}

	public static void stringDuplicateCharacterRemoval(String str) {
		Set<Character> characterSet = new LinkedHashSet<>();
		for (char c : str.toCharArray()) {
			characterSet.add(c);
		}
		String result = "";
		for (char c : characterSet) {
			result += c;
		}
		System.out.println("Result: " + result);
	}

}
