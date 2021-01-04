// extract the digits from a String in Java
// check whether a given String contains only digits or not
package com.sam.javaPracticeProblemsString;

public class StringDigitCheck {

	public static void main(String[] args) {
		String str1 = "Hello123World45";
		String str2 = "1234";
		extractDigitsFromString(str1);
		System.out.println(containsOnlyDigits1(str2));
		System.out.println(containsOnlyDigits2(str2));
		System.out.println(containsOnlyDigits3(str2));
	}

	public static void extractDigitsFromString(String str) {
		System.out.println(str.replaceAll("\\D", ""));
	}

	public static boolean containsOnlyDigits1(String str) {
		String newStr = str.replaceAll("\\d", "");
		return newStr.isEmpty();
	}

	public static boolean containsOnlyDigits2(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (charArray[i] >= '0' && charArray[i] <= '9') {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean containsOnlyDigits3(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
