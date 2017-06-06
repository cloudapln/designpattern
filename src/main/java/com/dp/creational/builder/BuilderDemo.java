package com.dp.creational.builder;

public class BuilderDemo {
	public static void main(String[] args) {
	    User user1 = new User.UserBuilder("first1", "last1")
	    .age(30)
	    .phone("909097")
	    .address("add1")
	    .build();
	 
	    System.out.println(user1);
	 
	    User user2 = new User.UserBuilder("first2", "last2")
	    .age(40)
	    .phone("111	")
	    //no address
	    .build();
	 
	    System.out.println(user2);
	 
	    User user3 = new User.UserBuilder("first3", "last3")
	    //No age
	    //No phone
	    //no address
	    .build();
	 
	    System.out.println(user3);
	}
}
