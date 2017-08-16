package com.test.desing.pattern.strategy;

public class SubtractOperation implements Operation{

	@Override
	public void doAction(int a, int b) {
		int devision = a-b;
		System.out.println("subtracting elements:" + devision);
		
	}

}
