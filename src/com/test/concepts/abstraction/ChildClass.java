package com.test.concepts.abstraction;

public class ChildClass extends AbstractClassTest{
	
	String serverName = "com.ChildClass.example.com";

	@Override
	public void getData() {
		
		System.out.println("ChildClass.getData()");
	}

	@Override
	public String getEmpName() {
		
		System.out.println("ChildClass.getEmpName()");
		return "Neeraj";
	}

	@Override
	public Integer getAge() {
		System.out.println("ChildClass.getAge()");
		return 32;
	}
	
	/* compliler will not force you to override this method,I have overriden this explicitly */
	@Override
	public double getEmpSalary()
	{
		System.out.println("ChildClass.getEmpSalary()");
		return 20.00;
	}
	
	
	public void callingDefaultMethodOfInterface()
	{
		//TestInterface.super.getEmpSalary();
		super.getEmpSalary();
		System.out.println(super.serverName);
	}
	

}
