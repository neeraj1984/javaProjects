package com.test.concepts.one;

public class ConstrutorClass {
	
	
	int id;
	String name;
	public ConstrutorClass()
	{
		
	}
	
	public ConstrutorClass(String name)
	{
		this.name = name;
	}
	
	protected ConstrutorClass(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	
	private ConstrutorClass(String name,int id,String company)
	{
		
	}

}
