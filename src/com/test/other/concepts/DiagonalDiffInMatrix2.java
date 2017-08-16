package com.test.other.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDiffInMatrix2 {
	
	 public static void main(String[] args) 
	 {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        int diagonalOne = 0, diagonalTwo = 0;
	        
	        for(int i=0; i < n; i++)
	        {
	            for(int j=0; j < n; j++)
	            {
	                a[i][j] = in.nextInt();
	                //System.out.println(Arrays.toString(a));
	                System.out.println(a[i][j]);
	            }
	            
	        }
	        in.close();
	   }

}
