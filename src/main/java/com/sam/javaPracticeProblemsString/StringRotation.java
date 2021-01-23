// check if two Strings are a rotation of each other
package com.sam.javaPracticeProblemsString;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second String: ");
		String str2 = scanner.nextLine();
		System.out.print("Are the two Strings rotation of each other?: ");
		System.out.println(isRotationOfEachOther(str1, str2) ? "Yes" : "No");
	}

	private static boolean isRotationOfEachOther(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		String str3 = str1 + str1;
		return str3.contains(str2) ? true : false;
	}

}
