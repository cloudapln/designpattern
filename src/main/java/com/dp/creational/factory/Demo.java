package com.dp.creational.factory;
public class Demo {

	public static void main(String[] args) {
		//AnimalFactory animalFactory = new AnimalFactory();

		Animal a1 = AnimalFactory.getInstance().getAnimal("feline");
		System.out.println("a1 sound: " + a1.makeSound());

		Animal a2 = AnimalFactory.getInstance().getAnimal("canine");
		System.out.println("a2 sound: " + a2.makeSound());
	}

}