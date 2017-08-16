package com.test.desing.pattern.singleton;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(null == instance)
		{
			instance = new Singleton();
		}
		return instance;
	}
	
	public void getData()
	{
		System.out.println("called method with singleton object");
	}

}
