package com.test.concepts;

public class QuickSortExample {
	
	private int array[];
    private int length;
    
	public void sort(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

	private void quickSort(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivotElement = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            
        	/* In each iteration, we will identify items from left side which
             * are less then the pivot value, and also we will identify items
             * from right side which are greater then the pivot value. 
             * 
             * Once the searchis done, then we exchange both numbers.
             *
             */
        	
            while (array[i] < pivotElement) {
                i++;
            }
            while (array[j] > pivotElement) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	
	public static void main(String a[]){
        
		QuickSortExample sorter = new QuickSortExample();
        int[] input = {24,8,45,99,12};
        System.out.print("before sort elements are:\n");
        for(int i = 0 ; i < input.length; i++)
        {
        	
        	System.out.print(" "+input[i]);
        }
        
        sorter.sort(input);
        System.out.print("\n after sort elements are:\n");
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }


}
