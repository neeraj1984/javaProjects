package com.test.java8.concepts;

public interface InterfaceTest {
	
	//only one of abstract, default, or static permitted
	//only public, abstract, default, static and strictfp are permitted (not private)
	//default and static methods can not be overridden
	public void test1();
	
	public default void test2()
	{
		System.out.println("default from java 8 onwards");
	}
	
	public static  int test3()
	{
		System.out.println("Either use static or default to have default body");
		return 0;
	}
	
	/*
	public abstract default void test4()
	{
		
	}
	*/
	
	//by default methos are public abstract
	void test5();
	
	//private abstract void test6();
	abstract void test7();

}
