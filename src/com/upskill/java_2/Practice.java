package com.upskill.java_2;

public class Practice {

	static int hourly_income = 50;     // Global variable 
	
	public static void main(String[] args) {
		//Void Method 
		// class + object_name = new + class 
		Practice void_method = new Practice();				// creating an object
		void_method.samiraSultanaIncome();					// calling object
		
		//Static Method
		samiraannualIncome();
		// Return Type 
		System.out.println("Samira's bimonthly income is : " + void_method.bimonthly() );
	}

	//void method 
	public void samiraSultanaIncome(){
		int monthlyIncome = hourly_income * 160;
		System.out.println("Samira's monthly is : " + monthlyIncome );
		
	}
	
	//static method 
	public static void samiraannualIncome(){
		int annualIncome = hourly_income * 2000;
		System.out.println("Samira's annual income is : " + annualIncome);
	}
	
	//Return Type Method 
	
	public int bimonthly(){
		int bimonthlyIncome = hourly_income * 320;
		return bimonthlyIncome;
	}
	
}



