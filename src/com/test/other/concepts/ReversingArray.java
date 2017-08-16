package com.test.other.concepts;

import java.util.Scanner;

public class ReversingArray {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        StringBuffer sf = new StringBuffer();
        int len = arr.length;
        for(int i = len-1 ; i >= 0;i--)
        {
            sf.append(arr[i] + " ");
        }
        System.out.println(sf.toString());
    }

}
