package com.test.concepts;

public class FactorialTest {

	static int factorial(int n) {
		System.out.println("calling for "+n);
		int fact = 1;
		if (n == 0)
			return 1;
		else
			fact = (n * factorial(n - 1));
		System.out.println("Factorial of " +n +" is "+fact);
		return fact;
	}

	public static void main(String args[]) {
		int number = 4;// It is the number to calculate factorial
		factorial(number);
		//System.out.println("Factorial of " + number + " is: " + fact);
	}

}
