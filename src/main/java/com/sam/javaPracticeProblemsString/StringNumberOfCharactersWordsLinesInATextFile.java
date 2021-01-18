// print the numbers of characters, number of words and number of lines in a given text file
package com.sam.javaPracticeProblemsString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringNumberOfCharactersWordsLinesInATextFile {

	public static void main(String[] args) {
		File file = new File("./files/SampleTextFile3.txt");
		try (FileReader fileReader = new FileReader(file)) {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String str;
			int numberOfCharacters = 0;
			int wordCount = 0;
			int numberOfLines = 0;
			while ((str = bufferedReader.readLine()) != null) {
				numberOfLines++;
				if (!str.trim().isEmpty()) {
					numberOfCharacters += str.length();
					String[] wordArray = str.split(" ");
					wordCount += wordArray.length;
				}
			}
			System.out.println("The number of characters in the given text file is: " + numberOfCharacters);
			System.out.println("The number of words in the given text file is: " + wordCount);
			System.out.println("The number of lines in the given text file is: " + numberOfLines);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
