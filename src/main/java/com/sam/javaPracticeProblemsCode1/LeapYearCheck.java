package com.sam.javaPracticeProblemsCode1;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYearCheck {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the year: ");
		int enteredYear = scanner.nextInt();
		System.out.println(leapYearCheck1(enteredYear));
		System.out.println(leapYearCheck2(enteredYear));
	}

	// Method1
	private static String leapYearCheck1(int year) {
		Calendar calendar = Calendar.getInstance(); // gets calendar based on
													// local timezone and locale
		calendar.set(Calendar.YEAR, year); // setting the calendar year
		int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		return numberOfDays > 365 ? "The year " + year + " is a leap year."
				: "The year " + year + " is not a leap year.";
	}

	// Method2
	private static String leapYearCheck2(int year) {
		return (year % 400 == 0) || ((year % 100) != 0 && (year % 4 == 0)) ? "The year " + year + " is a leap year."
				: "The year " + year + " is not a leap year.";
	}

}
