package com.test.concepts.abstraction;

public abstract class AbstractClassTest implements TestInterface{
	
	String serverName = "com.AbstractClassTest.example.com";
	
	public abstract Integer getAge();
	
	public String getCity()
	{
		System.out.println("getCity()");
		return "Hyderabad";
	}
	

}
