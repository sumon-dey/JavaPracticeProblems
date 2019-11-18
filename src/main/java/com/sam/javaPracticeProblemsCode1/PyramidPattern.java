package com.sam.javaPracticeProblemsCode1;

import java.util.Scanner;

public class PyramidPattern {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the pyramid level: ");
		int pyramidLevel = scanner.nextInt();
		starPyramidPattern(pyramidLevel);
		System.out.println("====================================================");
		numberPyramidPattern(pyramidLevel);
	}

	private static void starPyramidPattern(int pyramidLevel) {
		for (int i = 1; i <= pyramidLevel; i++) {
			for (int j = 1; j <= pyramidLevel - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void numberPyramidPattern(int pyramidLevel) {
		for (int i = 1; i <= pyramidLevel; i++) {
			for (int j = 1; j <= pyramidLevel - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
