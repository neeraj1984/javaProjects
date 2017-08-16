package com.test.concepts;

public class InsertionSortTest {
	
	/*Insertion sort: not good for huge data */
	private static void sort(int nos[]) 
	{
	     
		for (int i = 1; i < nos.length; i++)
		{
	          /* take the index of 2nd element and item of that index */
			  int currentLoopIndex = i;
	          int currentLoopIndexItem = nos[i];
	          
	          /* this loop does 2 things
	           * a) if value at right is smaller than assign greater value from left to current index
	           * b) set the current loop index which is used to put the current value after the loop
	           * c) (currentLoopIndex > 0) check removes first element to be checked
	           */
	          while ((currentLoopIndex > 0) && (nos[currentLoopIndex-1] > currentLoopIndexItem)){
	            nos[currentLoopIndex] = nos[currentLoopIndex-1];
	            currentLoopIndex--;
	          }
	          /* put current item in appropriate location,above loop will create the right index for currentLoopIndex */
	          nos[currentLoopIndex] = currentLoopIndexItem;
	      }
	 }

	public static void main(String args[])
	{
		int itemArray[] = new int[]{3,9,6,4,8,1};
		System.out.println("Before sorting items are:::");
		for(int i = 0 ; i < itemArray.length;i++)
		{
			if(i>0)
			{
				System.out.print(",");
			}
			System.out.print(itemArray[i]);
		}
		sort(itemArray);
		System.out.println("\n After sorting items are:::");
		for(int i = 0 ; i < itemArray.length;i++)
		{
			if(i>0)
			{
				System.out.print(",");
			}
			System.out.print(itemArray[i]);
		}
	}

}
