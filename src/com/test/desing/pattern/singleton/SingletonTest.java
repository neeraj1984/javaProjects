package com.test.desing.pattern.singleton;

public class SingletonTest {
	
	public static void main(String [] args)
	{
		Singleton object = Singleton.getInstance();
		object.getData();
	}

}
