package com.dp.creational.singleton;

public class SingleObjectStaticBlock {

	private static final SingleObjectStaticBlock INSTANCE;

	static {
		try {
			INSTANCE = new SingleObjectStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Error while creating instance of object", e);
		}
	}

	// make the constructor private so that this class cannot be instantiated
	private SingleObjectStaticBlock() {
	}

	public static SingleObjectStaticBlock getInstance() {
		return INSTANCE;
	}

}