// how to print duplicate characters from a String
package com.sam.javaPracticeProblemsString;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateCharacters {

	public static void main(String[] args) {
		String str = "Hello World";
		printDuplicateCharactersWay1(str);
		printDuplicateCharactersWay2(str);
	}

	public static void printDuplicateCharactersWay1(String str) {
		Map<Character, Integer> counterMap = new HashMap<>();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (counterMap.containsKey(str.charAt(i))) {
				counterMap.put(str.charAt(i), counterMap.get(str.charAt(i)) + 1);
			} else {
				counterMap.put(str.charAt(i), 1);
			}
		}
		System.out.println("The duplicate characters are:");
		for (Map.Entry<Character, Integer> entry : counterMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(" " + entry.getKey());
			}
		}
	}

	public static void printDuplicateCharactersWay2(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

			}
		}
	}

}
