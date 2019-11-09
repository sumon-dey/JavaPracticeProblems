package com.sam.javaPracticeProblemsCode1;

public class PatternPrinting1 {

	public static void main(String[] args) {
		pattern1();
		System.out.println("========================================");
		pattern2();
		System.out.println("========================================");
		pattern3();
	}

	private static void pattern1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	private static void pattern2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println("");
		}
	}

	private static void pattern3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

}
