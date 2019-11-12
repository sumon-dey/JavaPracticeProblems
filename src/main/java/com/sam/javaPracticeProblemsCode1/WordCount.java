package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class WordCount {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		String sentence = scanner.nextLine();
		System.out.println("The number of words in the entered sentence is: " + wordCount(sentence));
	}

	private static int wordCount(String sentence) {
		String[] wordArray = sentence.split(" ");
		return wordArray.length;
	}

}
