// sort a given string in Java
package com.sam.javaPracticeProblemsString;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorting {

	public static void main(String[] args) {
		String str = "hello";
		sortStringWay1(str);
		sortStringWay2(str);
	}

	private static void sortStringWay1(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
	}

	private static void sortStringWay2(String str) {
		Character[] characterArray = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) {
			characterArray[i] = str.charAt(i);
		}
		Arrays.sort(characterArray, new Comparator<Character>() {
			@Override
			public int compare(Character c1, Character c2) {
				return Character.compare(c1, c2);
			}
		});
		StringBuilder stringBuilder = new StringBuilder();
		for (Character c : characterArray) {
			stringBuilder.append(c);
		}
		System.out.println(stringBuilder.toString());
	}

}
