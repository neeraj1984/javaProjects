package com.test.sorting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class MapSoring {
	
	public static void main(String args[])
	{
		Map<Integer,String> testMap = new HashMap<Integer,String>();
		testMap.put(1, "neeraj");
		testMap.put(2, "ram");
		testMap.put(3, "raju");
		testMap.put(4, "kamal");
		testMap.put(5, "amit");
		
		
		Map<String, Integer> budget = new HashMap<>(); 
		budget.put("clothes", 120); 
		budget.put("grocery", 150); 
		budget.put("transportation", 100); 
		budget.put("utility", 130); 
		budget.put("rent", 1150); 
		budget.put("miscellneous", 90);

		
		Set<Entry<Integer, String>> a = testMap.entrySet();
		Iterator<Entry<Integer, String>> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		testMap.remove(3);
		Set<Entry<Integer, String>> b = testMap.entrySet();
		Iterator<Entry<Integer, String>> j = b.iterator();
		
		System.out.println("\n after removing an item \n");
		
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
		
		
		
		Map<String, Integer> sorted = budget.entrySet().stream().sorted(comparingByKey()) 
				.collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("map after sorting by keys in descending order: " + sorted);
		
	}

}
