package com.test.other.concepts;

import java.util.Arrays;
import java.util.Scanner;

/*
 * HakerRank Problem
 * 
 * 
 * Input Format
The first line contains a single integer N(size of matrix). The next N lines contain N integers describing the matrix.
 * 
 */

public class DiagonalDiffInMatrix {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {// converts bytes to charactors

			int length = Integer.parseInt(sc.nextLine());
			int diagonalOne = 0, diagonalTwo = 0;
			for (int i = 0; i < length; i++) {
				String[] line = sc.nextLine().split(" ");
				System.out.println(Arrays.toString(line)); //simplest way to print the array without loop
				diagonalOne += Integer.parseInt(line[i]);
				diagonalTwo += Integer.parseInt(line[line.length - 1 - i]);
			}
			System.out.println(Math.abs(diagonalOne - diagonalTwo));
		}
		// sc.close();
	}

}
