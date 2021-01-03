// reverse the words in a sentence
package com.sam.javaPracticeProblemsString;

import java.util.Scanner;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String[] wordArray = sentence.split(" ");
		String reversedSentence = "";
		for (int i = wordArray.length - 1; i >= 0; i--) {
			reversedSentence += wordArray[i] + " ";
		}
		System.out.println("Result: " + reversedSentence);
	}

}
