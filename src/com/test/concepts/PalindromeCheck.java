package com.test.concepts;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String [] args)
	{
		//String input = "aba";
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String reverseString = new StringBuilder(input).reverse().toString();

		System.out.println("input value is:"+input);
		if(input.equals(reverseString))
		{
			System.out.println("input is palindrome");
		}
		else
		{
			System.out.println("input is palindrome");
		}
		sc.close();
	}
}
