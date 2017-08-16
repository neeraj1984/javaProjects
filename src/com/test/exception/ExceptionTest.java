package com.test.exception;

public class ExceptionTest {
	
	public static void main(String[] args)
	{
		int i = 0;
		exceptionTest(i);
	}
	
	public static void exceptionTest(int counter)
	{
		if(counter == 0)
		{
			throw new CustomException1();
		}
	}

}
