// How to convert String to other data types and vice versa
package com.sam.javaPracticeProblemsString;

public class StringConversionToOtherDataTypes {

	public static void main(String[] args) {

		// String to int and vice versa
		String intStr1 = "123";
		int myInt = Integer.parseInt(intStr1);
		System.out.println(myInt);
		String intStr2 = Integer.toString(myInt);
		System.out.println(intStr2);
		System.out.println("*************************************************");

		// String to double and vice versa
		String doubleStr1 = "123.563";
		double myDouble = Double.parseDouble(doubleStr1);
		System.out.println(myDouble);
		String doubleStr2 = Double.toString(myDouble);
		System.out.println(doubleStr2);
		System.out.println("*************************************************");

		// String to long and vice versa
		String longStr1 = "1235362672892292";
		long myLong = Long.parseLong(longStr1);
		System.out.println(myLong);
		String longStr2 = Long.toString(myLong);
		System.out.println(longStr2);
		System.out.println("*************************************************");

		// String to float and vice versa
		String floatStr1 = "123.56F";
		float myFloat = Float.parseFloat(floatStr1);
		System.out.println(myFloat);
		String floatStr2 = Float.toString(myFloat);
		System.out.println(floatStr2);
		System.out.println("*************************************************");
	}

}
