package com.test.concepts.abstraction;

public interface TestInterface {
	
	String serverName = "com.Interface.example.com";
	
	void getData();
	
	String getEmpName();
	
	default double getEmpSalary()
	{
		System.out.println("TestInterface.getEmpSalary()");
		return 10.99;
	}
	
	public static void foo()
	{
		System.out.println("TestInterface.foo()");
	}
	
	/* can not use both default and static togethor */
	/*
	public static default void foo2()
	{
		
	}
	*/

}
