package com.test.concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {
	
	public static <T> void removeDuplicatesFromList(List<T> list1)
	{
		HashSet<T> hs = new HashSet<T>(list1);
		Iterator<T> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public static void main(String[] args)
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(1);
		a.add(8);
		
		removeDuplicatesFromList(a);
	}

}
