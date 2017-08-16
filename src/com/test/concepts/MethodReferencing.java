package com.test.concepts;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencing implements test{
	
	public static void main(String arg[])
	{
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("XDS");
		list.add("ghj");
		
		list.forEach(System.out::println);
		
		MethodReferencing obj = new MethodReferencing();
		obj.check();
	}
	
	public String check()
	{
		test interfaceTest = () -> test2();
		return interfaceTest.test2();
	}

	@Override
	public String test2() {
		System.out.println("overrideen version");
		return "hello";
	}

}

interface test
{
  public String test2();
}
