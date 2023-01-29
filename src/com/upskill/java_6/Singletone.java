package com.upskill.java_6;

public class Singletone {
	
	// Singletone is class that can have only object
	// Private constructor, it prevents any other class from instantiating

	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiatings
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	// getter method is public 
	public static Singleton getInstance(){
		return SingletonObj;
	}

	protected static void demo(){
		System.out.println("Singleton Demo Method");
	}
}

	
	

