package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

/*
 * Armstrong Number Examples
 * 153 -> 1  5  3 -> (1*1*1)+(5*5*5)+(3*3*3) -> 1+125+27 -> 153 (Armstrong Number)
 * 370 -> 3  7  0 -> (3*3*3)+(7*7*7)+(0*0*0) -> 27+343+0 -> 370 (Armstrong Number)
 * 142 -> 1  4  2 -> (1*1*1)+(4*4*4)+(2*2*2) -> 1+64+8 -> 73 (Not an Armstrong Number)
 * 1634 -> 1 6 3 4 -> (1*1*1*1)+(6*6*6*6)+(3*3*3*3)+(4*4*4*4) -> 1634 (Armstrong Number)
 * */

public class ArmstrongNumberCheck {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to check whether it is an Armstrong number or not:");
		int enteredNumber = scanner.nextInt();
		System.out.println(armstrongNumberCheck(enteredNumber));
	}

	private static String armstrongNumberCheck(int number) {
		int sum = 0, value = 0;
		int temp = number;
		int temp1 = number;
		int numberOfDigits = 0;
		while (temp1 > 0) {
			temp1 = temp1 / 10;
			numberOfDigits++;
		}
		while (number > 0) {
			value = number % 10;
			sum = sum + (int) Math.pow(value, numberOfDigits);
			number = number / 10;
		}
		return sum == temp ? "The number is an Armstrong Number" : "The number is not an Armstrong number";
	}

}
