package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class FibonacciSeries {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the count of numbers to print in the Fibonacci series: ");
		int countOfNumber = scanner.nextInt();
		int a = 1, b = 1, temp = 0;
		System.out.print(a + ", " + b + ", ");
		for (int counter = 1; counter <= countOfNumber; counter++) {
			temp = a + b;
			System.out.print(temp + ", ");
			a = b;
			b = temp;
		}
	}

}
