package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class StringDuplicateCharacters {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		String enteredString = scanner.nextLine();
		char[] characters = enteredString.toCharArray();
		int count = 0;
		for (int i = 0; i < characters.length; i++) {
			for (int j = i + 1; j < characters.length; j++) {
				if (characters[i] == characters[j]) {
					System.out.print(characters[j] + ", ");
					count++;
				}
			}
		}
		System.out.println("\nThe total number of duplicate characters in the String is: " + count);
	}

}
