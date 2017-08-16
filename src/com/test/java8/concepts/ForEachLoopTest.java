package com.test.java8.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLoopTest {
	
	
	public static void main(String args[])
	{
		List<String> alphabets = new ArrayList<String>(Arrays.asList("aa", "bbb", "cac", "dog"));
		
		String names[] = new String [5];
		names[0] = "a";
		
		// looping over all elements using Iterable.forEach() method 
		alphabets.forEach(s -> System.out.print(s + " ") );
		
		// with method reference 
		alphabets.forEach(System.out::println); 
		
		//do something with lambda parameter e.g. adding a comma 
		alphabets.forEach(s -> System.out.print(s + ","));
		
		// There is one more forEach() method on Stream class, which operates 
		// on stream and allows you to use various stream methods e.g. filter() map() etc 
		alphabets.stream().forEach(System.out::println);
		
		
	}

}
