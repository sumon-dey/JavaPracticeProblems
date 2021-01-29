// How to reverse a given String with preserving the position of spaces 
// Example: Input  : "abc de", Output : "edc ba"
package com.sam.javaPracticeProblemsString;

import java.util.Scanner;

public class StringReversalWithSpacesPositionPreserved {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String originalString = scanner.nextLine();
		reverseStringWithSpacePositionPreserved(originalString);
	}

	public static void reverseStringWithSpacePositionPreserved(String str) {
		char[] originalCharArray = str.toCharArray();
		char[] newCharArray = new char[str.length()];
		for (int i = 0; i < originalCharArray.length; i++) {
			if (originalCharArray[i] == ' ') {
				newCharArray[i] = ' ';
			}
		}
		int j = str.length() - 1;
		for (int i = 0; i < originalCharArray.length; i++) {
			if (originalCharArray[i] != ' ') {
				if (newCharArray[j] == ' ') {
					j--;
				}
				newCharArray[j] = originalCharArray[i];
				j--;
			}
		}
		System.out.println("Result: " + new String(newCharArray));
	}

}
