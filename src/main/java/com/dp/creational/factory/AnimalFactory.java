package com.dp.creational.factory;
public class AnimalFactory {
	
	//private volatile static  AnimalFactory INSTANCE;

	public Animal getAnimal(String type) {
		if ("canine".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
	
	/*public static AnimalFactory getInstance(){
		if( INSTANCE == null){
			synchronized (AnimalFactory.class) {
				if(INSTANCE == null){
					INSTANCE = new AnimalFactory();
				}
			}
		}
		return INSTANCE;
	}*/
	public static AnimalFactory getInstance(){
		return LazyLoad.INSTANCE;
	}
	
	private static class LazyLoad{
		private static final AnimalFactory INSTANCE = new AnimalFactory(); 
	}
}