package com.test.concepts;

public class PrimeNumber {
	
	public static void main(String [] args)
	{
		
		for(int i = 1; i < 50; i++)
		{	
			boolean isPrime = true;
			for(int j = 2; j <= i/2 ; j++)
			{
				if(i%j == 0)
				{
					isPrime =  false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(i+" number is prime");
			}
		}
	}

}
