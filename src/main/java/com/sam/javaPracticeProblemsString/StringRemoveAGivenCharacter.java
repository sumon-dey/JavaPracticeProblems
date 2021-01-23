// remove a given character from a given string and print the result
package com.sam.javaPracticeProblemsString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StringRemoveAGivenCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("Enter the character to remove from the String: ");
		char c = scanner.next().charAt(0);
		System.out.println(removeCharacterWay1(str, c));
		System.out.println(removeCharacterWay2(str, c));
		System.out.println(removeCharacterWay3(str, c));
		System.out.println(removeCharacterWay4(str, c));
	}

	private static String removeCharacterWay1(String originalString, char characterToRemove) {
		return originalString.replaceAll(String.valueOf(characterToRemove), "");
	}

	private static String removeCharacterWay2(String originalString, char characterToRemove) {
		char[] newCharArray = new char[originalString.length()];
		for (int i = 0, j = 0; i < originalString.length(); i++) {
			if (originalString.charAt(i) != characterToRemove) {
				newCharArray[j] = originalString.charAt(i);
				j++;
			}
		}
		return new String(newCharArray);
	}

	private static String removeCharacterWay3(String originalString, char characterToRemove) {
		String result = "";
		for (int i = 0; i < originalString.length(); i++) {
			if (originalString.charAt(i) != characterToRemove) {
				result += originalString.charAt(i);
			}
		}
		return result;
	}

	private static String removeCharacterWay4(String originalString, char characterToRemove) {
		List<Character> charList = new ArrayList<>();
		for (char c : originalString.toCharArray()) {
			if (c != characterToRemove) {
				charList.add(c);
			}
		}
		String result = "";
		Iterator<Character> iterator = charList.listIterator();
		while (iterator.hasNext()) {
			result += iterator.next();
		}
		return result;
	}

}
