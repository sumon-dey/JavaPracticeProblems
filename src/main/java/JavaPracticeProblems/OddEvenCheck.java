/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JavaPracticeProblems;

import java.util.Scanner;

public class OddEvenCheck {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to check whether it is odd or even: ");
		int enteredNumber = scanner.nextInt();
		System.out.println(enteredNumber % 2 == 0 ? "The entered number is Even" : "The entered number is Odd");
	}
}
