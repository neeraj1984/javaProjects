package com.test.concepts.one;

public class ConstructorTest {
	
	
	public static void main(String args[])
	{
		
		ConstrutorClass obj1 = new ConstrutorClass();
		ConstrutorClass obj2 = new ConstrutorClass("Neeraj");
		ConstrutorClass obj3 = new ConstrutorClass("Neeraj",1302);
		
		/* private Constructor can not be called from other class */
		//ConstrutorClass obj4 = new ConstrutorClass("Neeraj", 1302,"LiquidHub");
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name + " ," +obj3.id);
		
	}
	
}


