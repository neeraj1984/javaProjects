package com.test.other.concepts;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reversing2DArray {

	public static void main(String args[]) throws Exception {
		String line;
		String arr[];
		int N, M;
		System.out.println("first line argument will be height and width of matrix");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		line = br.readLine();
		arr = line.split(" ");
		
		N = Integer.parseInt(arr[0]);
		M = Integer.parseInt(arr[1]);
		
		int a[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			arr = line.split(" ");
			for (int j = 0; j < M; j++) {
				a[i][j] = Integer.parseInt(arr[j]);
			}
		}

		/* */
		for (int i = 0; i < M; i++) 
		{
			for (int j = 0; j < N; j++) 
			{
				System.out.print(a[j][i]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
