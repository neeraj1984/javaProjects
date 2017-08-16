package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamingTest1 {
	
	public static void main(String args[]) 
	{ 
		// Count the empty strings 
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		long count1 = strList.stream().filter(x -> x.isEmpty()).count(); 
		
		Stream<String> s = strList.stream();
		Stream<String> s2 = s.filter(x -> x.isEmpty());
		long count2 = s2.count();
		
		System.out.printf("List %s has %d empty strings %n", strList, count2);
		
		
		long count3 = strList.stream().filter(x -> x.startsWith("a")).count(); 
		System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count3);
		
		
		List<Integer> intList = Arrays.asList(2,5,1,0,4,6,8,3);
		long count4 = intList.stream().filter(x -> x > 3).count();
		System.out.printf("List %s has %d values > 3  %n", intList, count4);

	}

}
