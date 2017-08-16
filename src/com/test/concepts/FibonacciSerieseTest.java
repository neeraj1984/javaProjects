package com.test.concepts;

public class FibonacciSerieseTest {
	
	public static void main(String [] args)
	{
		int i = 0;
		int j = 1;
		int fibo = 1;
		int limit = 10;
		int counter = 2;
		
		while(counter < limit)
		{
			fibo = i +j ;
			i = j;
			j = fibo;
			System.out.println(fibo);
			
			++counter;
		}
		
	}

}
