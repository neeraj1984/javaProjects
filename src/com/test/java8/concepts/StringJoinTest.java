package com.test.java8.concepts;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class StringJoinTest {

	public static void main(String args[]) {

		/* join() comes with 2 different signatures */
		
		String baseDirectory = "baseDir";
		String subFolder = "subFolder";
		String fileName = "fileName.txt";
		
		List<String> filePathParts = Arrays.asList(baseDirectory, subFolder, fileName);
		File file1 = new File(String.join(File.separator, filePathParts));
		System.out.println("file1 is with join with diff arguments: "+ file1.toString());
		
		File file2 = new File(String.join(File.separator, "abc", "neeraj", "myFile.txt"));
		System.out.println("file2 is with join with diff arguments: "+ file2.toString());
		
		System.out.println("normal join() call : "+ String.join("\\", "neeraj","hello"));
	}

}
