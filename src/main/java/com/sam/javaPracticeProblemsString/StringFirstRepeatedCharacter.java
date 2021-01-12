// print the first repeated character in a given String
package com.sam.javaPracticeProblemsString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringFirstRepeatedCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		firstRepeatedCharacterWay1(str);
		firstRepeatedCharacterWay2(str);
	}

	public static void firstRepeatedCharacterWay1(String str) {
		char[] charArray = str.toCharArray();
		char firstRepeatedCharacter = 0;
		outer: for (int i = 0; i < str.length(); i++) {
			inner: for (int j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					firstRepeatedCharacter = charArray[i];
					break outer;
				}
			}
		}
		if (firstRepeatedCharacter == 0) {
			System.out.println("There are no repeated characters.");
		} else {
			System.out.println("The first repeated character is: " + firstRepeatedCharacter);
		}
	}

	public static void firstRepeatedCharacterWay2(String str) {
		List<Character> charList = new ArrayList<>();
		char firstRepeatedCharacter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!charList.contains(str.charAt(i))) {
				charList.add(str.charAt(i));
			} else {
				firstRepeatedCharacter = str.charAt(i);
				break;
			}
		}
		if (firstRepeatedCharacter == 0) {
			System.out.println("There are no repeated characters.");
		} else {
			System.out.println("The first repeated character is: " + firstRepeatedCharacter);
		}
	}

}
