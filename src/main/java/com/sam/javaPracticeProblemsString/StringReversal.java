// How to reverse a String
package com.sam.javaPracticeProblemsString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String originalString = scanner.nextLine();
		way1(originalString);
		way2(originalString);
		way3(originalString);
		way4(originalString);
		way5(originalString);
		way6(originalString);
	}

	public static void way1(String originalString) {
		String reversedString = "";
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString += originalString.charAt(i);
		}
		System.out.println("After the string is reversed, the output is: " + reversedString);
	}

	public static void way2(String originalString) {
		String reversedString = "";
		char[] charArray = originalString.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversedString += charArray[i];
		}
		System.out.println("After the string is reversed, the output is: " + reversedString);
	}

	public static void way3(String originalString) {
		StringBuilder stringBuilder = new StringBuilder(originalString);
		System.out.println("After the string is reversed, the output is: " + stringBuilder.reverse());
	}

	public static void way4(String originalString) {
		byte[] originalByteArray = originalString.getBytes();
		byte[] newByteArray = new byte[originalByteArray.length];
		for (int i = 0; i < originalByteArray.length; i++) {
			newByteArray[i] = originalByteArray[originalByteArray.length - i - 1];
		}
		System.out.println("After the string is reversed, the output is: " + new String(newByteArray));
	}

	public static void way5(String originalString) {
		char[] charArray = originalString.toCharArray();
		int first;
		int last = originalString.length() - 1;
		for (first = 0; first < last; first++, last--) {
			char temp = charArray[first];
			charArray[first] = charArray[last];
			charArray[last] = temp;
		}
		System.out.println("After the string is reversed, the output is: " + new String(charArray));
	}

	public static void way6(String originalString) {
		char[] charArray = originalString.toCharArray();
		List<Character> charList = new ArrayList<>();
		for (char c : charArray) {
			charList.add(c);
		}
		Collections.reverse(charList);
		String reversedString = "";
		for (char c : charList) {
			reversedString += c;
		}
		System.out.println("After the string is reversed, the output is: " + reversedString);
	}

}
