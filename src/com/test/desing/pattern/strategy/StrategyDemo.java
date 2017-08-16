package com.test.desing.pattern.strategy;

public class StrategyDemo {
	
	public static void main(String args[])
	{
		Context con1 = new Context(new AddOperation());
		con1.executeOperation(10, 20);
		
		Context con2 = new Context(new SubtractOperation());
		con2.executeOperation(45, 23);
		
		Context con3 = new Context(new MultiplyOperation());
		con3.executeOperation(5, 7);
	}

}
