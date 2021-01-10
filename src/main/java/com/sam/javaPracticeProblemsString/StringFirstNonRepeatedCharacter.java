// print the first non-repeated character in a given String
package com.sam.javaPracticeProblemsString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(firstNonRepeatedCharacterWay1(str));
		System.out.println("*******************************************************");
		System.out.println(firstNonRepeatedCharacterWay2(str));
		System.out.println("*******************************************************");
		System.out.println(firstNonRepeatedCharacterWay3(str));
		System.out.println("*******************************************************");
	}

	public static String firstNonRepeatedCharacterWay1(String str) {
		Map<Character, Integer> counterHashMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!counterHashMap.containsKey(str.charAt(i))) {
				counterHashMap.put(str.charAt(i), 1);
			} else {
				counterHashMap.put(str.charAt(i), counterHashMap.get(str.charAt(i)) + 1);
			}
		}
		Map<Character, Integer> indexMap = new HashMap<>();
		for (Map.Entry<Character, Integer> entry : counterHashMap.entrySet()) {
			if (entry.getValue() == 1) {
				indexMap.put(entry.getKey(), str.indexOf(entry.getKey()));
			}
		}
		if (indexMap.isEmpty()) {
			return "All the characters in the String are repeated";
		}
		return "The first non-repeated character in the String is: " + str.charAt(Collections.min(indexMap.values()));
	}

	public static String firstNonRepeatedCharacterWay2(String str) {
		Map<Character, Integer> counterLinkedHashMap = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			counterLinkedHashMap.put(c, counterLinkedHashMap.containsKey(c) ? counterLinkedHashMap.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> entry : counterLinkedHashMap.entrySet()) {
			if (entry.getValue() == 1) {
				return "The first non-repeated character in the String is: " + entry.getKey();
			}
		}
		return "All the characters in the String are repeated";
	}

	public static String firstNonRepeatedCharacterWay3(String str) {
		List<Character> nonRepeatingList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (!nonRepeatingList.contains(str.charAt(i))) {
				nonRepeatingList.add(str.charAt(i));
			} else {
				nonRepeatingList.remove(Character.valueOf(str.charAt(i)));
			}
		}
		if (!nonRepeatingList.isEmpty()) {
			return "The first non-repeated character in the String is: " + nonRepeatingList.get(0);
		}
		return "All the characters in the String are repeated";
	}

}
