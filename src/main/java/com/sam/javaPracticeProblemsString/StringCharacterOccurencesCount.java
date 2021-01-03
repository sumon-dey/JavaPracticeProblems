// count the total number of occurrences of a given character in a String without using any loop
// count the frequency of occurrences of the characters in a given String
package com.sam.javaPracticeProblemsString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCharacterOccurencesCount {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		countOccurrencesOfACharacter('e', str);
		characterFrequencyCount(str);
	}

	public static void countOccurrencesOfACharacter(char c, String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("The number of occurences of the character " + c + " in the string is: " + count);
	}

	public static void characterFrequencyCount(String str) {
		Map<Character, Integer> frequencyCollector = new HashMap<>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (!frequencyCollector.containsKey(str.charAt(i))) {
				frequencyCollector.put(str.charAt(i), 1);
			} else {
				frequencyCollector.put(str.charAt(i), frequencyCollector.get(str.charAt(i)) + 1);
			}
		}
		System.out.println(frequencyCollector.toString());
		for (Map.Entry<Character, Integer> entry : frequencyCollector.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
