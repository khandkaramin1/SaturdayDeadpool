package com.upskill.java_5;

public abstract class Abstractclass {

	//Abstract class has both method and regular method 
	
	public void car(){
		System.out.println("My car is Audi !");
		
	}
	// Abstract method doesn't have any implementation
	public abstract void iDoor();
	
	// return type regular and abstract method 
	
	//Return Type Method
	
	int hourlyIncome = 40;
		public int monthlyIncome(){
			int calculateMonthlyIncome = hourlyIncome *180;
			return calculateMonthlyIncome;
	}
		
		//Return Abstract Method 
		
		public abstract int imethod();
		
		// Return type string regular and abstract method;
		
		public String bus(){
			return "Greyhound";
		}
			
		public abstract String ibus();
		
		
		
		
		
		
		
		
}
