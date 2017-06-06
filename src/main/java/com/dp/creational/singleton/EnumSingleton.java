package com.dp.creational.singleton;

/**
 * 
 * Enum is thread safe and implementation of Singleton through Enum ensures that
 * your singleton will have only one instance even in a multithreaded
 * environment
 * 
 * client side call public static void main(String[] args) {
 * SingletonEnum.INSTANCE.doStuff(); } }
 * 
 */
public enum EnumSingleton {
	INSTANCE;
	public void doStuff() {
		System.out.println("Singleton using Enum");
	}
}
