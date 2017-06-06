package com.dp.creational.singleton;

public class SingleObjectLazy {

	// create static instance of class
	private static volatile SingleObjectLazy instance = null;

	// make the constructor private so that this class cannot be instantiated
	private SingleObjectLazy() {
	}

	// Get static instance of object
	public static SingleObjectLazy getInstance() {
        if (instance == null) {
            synchronized (SingleObjectLazy.class) {
            	 if (instance == null) {
                     instance = new SingleObjectLazy();
                 }
            }
        }
        return instance;
    }

}
