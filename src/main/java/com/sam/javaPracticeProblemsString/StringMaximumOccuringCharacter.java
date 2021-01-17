// find the maximum occurring character in a given string
package com.sam.javaPracticeProblemsString;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringMaximumOccuringCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		displayMaximumOccuringCharacter(str);
	}

	private static void displayMaximumOccuringCharacter(String str) {
		Map<Character, Integer> frequencyCounterMap = new HashMap<>();
		int mostOccuringCharacterFrequency;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (frequencyCounterMap.containsKey(str.charAt(i))) {
				frequencyCounterMap.put(str.charAt(i), frequencyCounterMap.get(str.charAt(i)) + 1);
			} else {
				frequencyCounterMap.put(str.charAt(i), 1);
			}
		}
		if (frequencyCounterMap.isEmpty()) {
			System.out.println("There are no characters in the String.");
		} else {
			for (Map.Entry<Character, Integer> entry : frequencyCounterMap.entrySet()) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
			mostOccuringCharacterFrequency = Collections.max(frequencyCounterMap.values());
			System.out.println("The maximum occuring character(s) in the String is: ");
			for (Map.Entry<Character, Integer> entry : frequencyCounterMap.entrySet()) {
				if (entry.getValue() == mostOccuringCharacterFrequency) {
					System.out.println(entry.getKey());
				}
			}
		}
	}

}
