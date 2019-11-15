package com.sam.javaPracticeProblemsCode1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondHighestNumber {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array: ");
		int[] myArray = new int[scanner.nextInt()];
		scanner.nextLine();
		System.out.println("Enter the elements: ");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scanner.nextInt();
			scanner.nextLine();
		}
		int largest = myArray[0];
		int secondLargest = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > largest) {
				secondLargest = largest;
				largest = myArray[i];
			} else if (myArray[i] > secondLargest && myArray[i] != largest) {
				secondLargest = myArray[i];
			}
		}
		System.out.println("Second highest number in the array is: " + secondLargest);

	}

}
