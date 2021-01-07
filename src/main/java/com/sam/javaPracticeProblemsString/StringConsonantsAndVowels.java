// print the count of vowels and consonants in a given String
package com.sam.javaPracticeProblemsString;

import java.util.Scanner;

public class StringConsonantsAndVowels {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		displayVowelAndConsonantCount(str);
	}

	public static void displayVowelAndConsonantCount(String str) {
		str = str.toLowerCase();
		int numberOfVowels = 0, numberOfConsonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				numberOfVowels++;
			} else if (c >= 'a' && c <= 'z') {
				numberOfConsonants++;
			}
		}
		System.out.println("Number of vowels in the string is: " + numberOfVowels);
		System.out.println("Number of consonants in the string is: " + numberOfConsonants);
	}

}
