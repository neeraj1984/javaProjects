package com.test.concepts;

public class PalindromeCheck2 {
	
	public static void main(String [] args){
		PalindromeCheck2 pn = new PalindromeCheck2();

        if(pn.isPalindrome2("Neveroddoreven"))
        {
            System.out.println("Palindrome");
        } 
        else 
        {
            System.out.println("Not Palindrome");
        }   
    }

    public boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) 
        {
            if(original.charAt(i) != original.charAt(j)) 
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    
    
    public boolean isPalindrome2(String original)
    {
        for(int i =0,j =original.length()-1; j > i; i++,j--)
        {
        	if(original.toUpperCase().charAt(i) != original.toUpperCase().charAt(j))
            {
                return false;
            }
        }
        return true;
    }

}
