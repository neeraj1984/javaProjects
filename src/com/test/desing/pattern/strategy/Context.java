package com.test.desing.pattern.strategy;

public class Context {
	
	Operation operation;
	public Context(Operation operation)
	{
		this.operation = operation;
	}
	
	public void executeOperation(int a,int b)
	{
		operation.doAction(a, b);
	}

}
