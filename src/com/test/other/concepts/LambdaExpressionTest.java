package com.test.other.concepts;

public class LambdaExpressionTest {
	
	public static void main(String args[])
	{
		
		LambdaExpressionTest tester = new LambdaExpressionTest();
		
		MathOperation op =  (int a, int b) -> a + b +5; /* target type must be an functional interface */
		
		
		//var inc = (x:Int) => x+1   //scala example
		
		System.out.println("10 + 5 = " + tester.operate1(10, 5, op));
		
		//() -> System.out.println("lambda without parameter");
	}

	interface MathOperation {
	      int operation1(int a, int b);
	      //int operation2(int a, int b); /* with 2 methods lambda does not work*/
	   }
	
	
	private int operate1(int a, int b, MathOperation mathOperation)
	{
	      return mathOperation.operation1(a, b);
	 }
}
