package com.test.concepts;

public class ReversingString {
	
	public static void main(String [] args)
	{
		String input = "neeraj";
		System.out.println(input);
		
		String output = reverse(input);
		
		System.out.println(output);
		
	}
	
	public static String reverse(String input)
	{
		StringBuilder retval =new StringBuilder();
		
		char[] abc = input.toCharArray();
		
		for(int i = abc.length -1; i >= 0; i-- )
		{
			retval.append(abc[i]);
		}
	
		return retval.toString();
	}

}
