package com.test.other.concepts;

import java.util.LinkedList;
import java.util.Scanner;

public class FindingNthElementInALinkedList {
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> test = new LinkedList<Integer>();
		test.add(10);
		test.add(2);
		test.add(45);
		test.add(27);
		test.add(76);
		test.add(19);
		System.out.println("enter the position to find the element:");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		
		System.out.println(findPosition(test,n));
        
    }
	
	public static int findPosition(LinkedList<Integer> testArray,int nthPosition)
	{
		for(int i =0;i <testArray.size();i++ )
		{
			if(i == nthPosition)
			{
				 int result = testArray.get(i);
				 return result;
			}
		}
		return -1;
	}


	
	class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

}
