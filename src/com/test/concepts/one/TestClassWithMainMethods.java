package com.test.concepts.one;


/*
 * we can not create a package name starting with java,runtime exception
 */
public class TestClassWithMainMethods {
	
	String name = "neeraj";
	/*
	private static void main(String args[])
	{
		System.out.println("private");
	}
	*/
	
	/*
	protected static void main(String args[])
	{
		System.out.println("protected");
	}
	*/
	
	/*
	static void main(String args[])
	{
		System.out.println("default");
	}
	*/
	
	/*
	public void main(String args[])
	{
		System.out.println("without static keyword");
	}
	*/
	
	
	
	public static void main(String args[])
	{
		TestClassWithMainMethods obj = new TestClassWithMainMethods();
		System.out.println("public");
		System.out.println("first argument is:"+args[0] + obj.name);
		System.out.println("second argument is" + args[1]);
		
	}


}
