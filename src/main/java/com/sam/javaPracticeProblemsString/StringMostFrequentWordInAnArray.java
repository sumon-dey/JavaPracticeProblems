// given an array of Strings, find the most frequent word(string) in that array. 
// In case of a tie, the smallest string (lexicographically) is printed.
package com.sam.javaPracticeProblemsString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringMostFrequentWordInAnArray {

	public static void main(String[] args) {
		String[] strArray = { "Hello", "Java", "Programmers", "Hello", "World", "Java", "Programmers" };
		Map<String, Integer> frequencyCounterMap = new HashMap<>();
		for (int i = 0; i < strArray.length; i++) {
			if (frequencyCounterMap.containsKey(strArray[i])) {
				frequencyCounterMap.put(strArray[i], frequencyCounterMap.get(strArray[i]) + 1);
			} else {
				frequencyCounterMap.put(strArray[i], 1);
			}
		}
		int highestFrequency = Collections.max(frequencyCounterMap.values());
		List<String> frequentWordList = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : frequencyCounterMap.entrySet()) {
			if (entry.getValue() == highestFrequency) {
				frequentWordList.add(entry.getKey());
			}
		}
		String smallestString = frequentWordList.get(0);
		for (String str : frequentWordList) {
			if (str.compareTo(smallestString) < 0) {
				smallestString = str;
			}
		}
		System.out.println("The most frequent word is: " + smallestString);
	}

}
