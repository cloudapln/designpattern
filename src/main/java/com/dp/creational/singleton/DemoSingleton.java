package com.dp.creational.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // make the constructor private so that this class cannot be instantiated
    private DemoSingleton() {}
 
    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();
    }
 
    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }
 
    protected Object readResolve() {
        return getInstance();
    }
}