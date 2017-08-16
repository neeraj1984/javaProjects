package com.test.concepts.abstraction;

public class MainTestClass {
	
	public static void main(String [] args)
	{
		AbstractClassTest ab = new ChildClass();
		ChildClass cc = new ChildClass();
		
		ab.getData();
		cc.getData();
		
		//how to call default method getEmpSalary() of TestInterface?
		ab.getEmpSalary(); //calls overriden
		cc.getEmpSalary(); //calls overriden
		
		cc.callingDefaultMethodOfInterface(); //this calls with super
		
		System.out.println(cc.serverName);
		
		/* static variable and method call for interface */
		System.out.println(TestInterface.serverName);		
		TestInterface.foo();
	}

}
