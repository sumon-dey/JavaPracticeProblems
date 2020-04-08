package com.sam.javaPracticeProblemsCode1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileComparison {

	public static void main(String[] args) {
		try {
			File file1 = new File("./files/SampleTextFile1.txt");
			File file2 = new File("./files/SampleTextFile2.txt");
			BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
			BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
			int lineNum = 1;
			boolean areEqual = true;
			String line1 = bufferedReader1.readLine();
			String line2 = bufferedReader2.readLine();
			while (line1 != null || line2 != null) {
				if (line1 == null || line2 == null) {
					areEqual = false;
					break;
				} else if (!line1.equals(line2)) {
					areEqual = false;
					break;
				}
				line1 = bufferedReader1.readLine();
				line2 = bufferedReader2.readLine();
				lineNum++;
			}
			if (areEqual) {
				System.out.println("The two files have same content.");
			} else {
				System.out.println("Two files have different content. They differ at line: " + lineNum);
				System.out.println("File1 has " + line1 + " and File2 has " + line2 + " at line " + lineNum);
			}
			bufferedReader1.close();
			bufferedReader2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
