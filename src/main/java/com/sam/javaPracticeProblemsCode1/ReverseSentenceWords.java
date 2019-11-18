package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class ReverseSentenceWords {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the sentence whose words are needed to be reversed: ");
		String enteredSentence = scanner.nextLine();
		String[] words = enteredSentence.trim().split("\\s");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			stringBuilder.append(words[i]);
			stringBuilder.append(" ");
		}
		System.out.println(stringBuilder.toString().trim());
	}

}
