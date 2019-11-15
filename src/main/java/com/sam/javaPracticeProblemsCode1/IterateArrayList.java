package com.sam.javaPracticeProblemsCode1;

import java.util.ArrayList;

public class IterateArrayList {

	private static ArrayList<String> myArrayList = new ArrayList<>();

	public static void main(String[] args) {
		myArrayList.add("Sydney");
		myArrayList.add("Perth");
		myArrayList.add("Melbourne");
		myArrayList.add("Canberra");
		myArrayList.add("Adelaide");
		iterateWithForLoop(myArrayList);
		iterateWithWhileLoop(myArrayList);
		iterateWithEnhancedForLoop(myArrayList);
	}

	private static void iterateWithForLoop(ArrayList<String> theArrayList) {
		System.out.println("Using for loop: ");
		for (int i = 0; i < theArrayList.size(); i++) {
			System.out.print(theArrayList.get(i) + ", ");
		}
		System.out.println("\n********************************************************************");
	}

	private static void iterateWithWhileLoop(ArrayList<String> theArrayList) {
		int i = 0;
		System.out.println("Using while loop: ");
		while (i < theArrayList.size()) {
			System.out.print(theArrayList.get(i) + ", ");
			i++;
		}
		System.out.println("\n********************************************************************");
	}

	private static void iterateWithEnhancedForLoop(ArrayList<String> theArrayList) {
		System.out.println("Using enhanced for loop: ");
		for (String city : theArrayList) {
			System.out.print(city + ", ");
		}
		System.out.println("\n********************************************************************");
	}

}
