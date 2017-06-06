package com.dp.creational.singleton;
/**
 * Instance created at system startup.
 * 
 * @author 
 *
 */
public class SingleObjectEager {

	// create static instance of class
	private static volatile SingleObjectEager instance = new SingleObjectEager();

	// make the constructor private so that this class cannot be instantiated
	private SingleObjectEager() {
	}

	// Get static instance of object
	public static SingleObjectEager getInstance() {
		return instance;
	}

}
