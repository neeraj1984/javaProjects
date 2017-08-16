package com.test.desing.pattern.singleton;

/*
 * 
 * Here's a very popular implementation using a static class, 
 * which brings the powers of lazy loading and thread safety.
 */

public class Singleton3 {
	
	
	private Singleton3() {}
    
	private static class SingletonUisngInner 
	{
        private static Singleton3 mySingleton = new Singleton3();
    }
    
    public static Singleton3 getInstance() 
    {
        return SingletonUisngInner.mySingleton;
    }

}
