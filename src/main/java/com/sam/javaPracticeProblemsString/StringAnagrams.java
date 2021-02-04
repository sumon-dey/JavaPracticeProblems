// check whether two given Strings are anagrams to each other or not
// Two string are anagrams to each other if they contain the same set of characters but in different order
package com.sam.javaPracticeProblemsString;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second String: ");
		String str2 = scanner.nextLine();
		System.out.println(isAnagramToEachOther(str1, str2));
	}

	private static boolean isAnagramToEachOther(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] str1CharArray = str1.toLowerCase().toCharArray();
		char[] str2CharArray = str2.toLowerCase().toCharArray();
		Arrays.sort(str1CharArray);
		Arrays.sort(str2CharArray);
		return Arrays.equals(str1CharArray, str2CharArray) ? true : false;
	}

}
