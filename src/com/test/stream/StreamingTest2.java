package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingTest2 {
	
	public static void main(String args[])
	{
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		// Remove all empty Strings from List 
		List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList()); 
		System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);
		
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList()); 
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);


	}

}
