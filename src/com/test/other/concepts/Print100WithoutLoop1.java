package com.test.other.concepts;

public class Print100WithoutLoop1 {
	
	//public static int num = 1;
	public static void main(String args[])
	{
		int num = 1;
		printNumbers(num);
	}

	
	public static void printNumbers(int number)
	{
		
		if(number > 100)
		{
			return;
		}
		System.out.println("Number is :"+number);
		printNumbers(number+1);
		
		
	}
}
