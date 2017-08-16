package com.test.desing.pattern.singleton;

/*
 * this class guarantees thread safety.changes done by one thread will be visible to another.
 * using volatile
 */
public class Singleton2 {
	
	
	private volatile static Singleton2 mySingleton;
    
	private Singleton2() {}
    
    public static Singleton2 getInstance() {
        if (null == mySingleton) {
            synchronized(Singleton2.class) {
                if (null == mySingleton) {
                    mySingleton = new Singleton2();
                }
            }
        }
        return mySingleton;
    }

}
