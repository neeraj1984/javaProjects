package com.test.desing.pattern.strategy;

public class AddOperation implements Operation{

	@Override
	public void doAction(int a, int b) {
		int sum = a+b;
		System.out.println("adding elements:" + sum);
		
	}

}
