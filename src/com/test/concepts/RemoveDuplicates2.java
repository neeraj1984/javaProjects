package com.test.concepts;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates2 {
	
	public static void main(String [] args)
	{
		List<Integer> dupList = new ArrayList<Integer>();
		dupList.add(3);
		dupList.add(5);
		dupList.add(2);
		dupList.add(3);
		dupList.add(2);
		
		System.out.println("before removing duplicates....");
		for(int i = 0;i<dupList.size();i++)
		{
			System.out.println(dupList.get(i));
		}
		
		List <Integer> newList = removeDuplicates(dupList);
		System.out.println("After removing duplicates....");
		for(int i = 0;i<newList.size();i++)
		{
			System.out.println(newList.get(i));
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static List<Integer> removeDuplicates(List<Integer> list1)
	{
		@SuppressWarnings({ "rawtypes", "unused" })
		List <Integer>resultList = new <Integer>ArrayList();
		
		for(int i = 0; i < list1.size();i++ )
		{
			for(int j = i+1; j < list1.size(); j++)
			{
				if(list1.get(i) == list1.get(j))
				{
					list1.remove(j);
					j--;
				}
			}

		}
		return list1;
	}

}
