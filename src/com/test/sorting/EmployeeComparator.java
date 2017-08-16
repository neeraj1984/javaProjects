package com.test.sorting;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		
		int sortByFirstName = emp1.getFirstName().compareTo(emp2.getFirstName());
		if(sortByFirstName ==0)
		{
			int sortByLastName = emp1.getLastName().compareTo(emp2.getLastName());
			return sortByLastName;
		}
		return sortByFirstName;
	}

}
