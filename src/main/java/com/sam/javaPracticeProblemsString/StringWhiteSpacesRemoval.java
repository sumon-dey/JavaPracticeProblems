// print after removing all the whitespaces from a String
package com.sam.javaPracticeProblemsString;

import java.util.Scanner;

public class StringWhiteSpacesRemoval {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		removeAllWhitespacesAndPrint(str);
	}

	private static void removeAllWhitespacesAndPrint(String str) {
		System.out.println(str.replaceAll("\\s+", ""));
	}

}
