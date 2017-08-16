package com.test.desing.pattern.strategy;

public class MultiplyOperation implements Operation{

	@Override
	public void doAction(int a, int b) {
		
		int multiply = a*b;
		System.out.println("multiplying elements:" + multiply);
		
	}

}
