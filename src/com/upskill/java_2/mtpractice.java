package com.upskill.java_2;

public class mtpractice {
	

public static int hourlyIncome = 50;
	


	public static void main(String[] args) {
		mtpractice c = new mtpractice();		//creating object
		c.weeklyIncome();

		monthlyIncome(); // Static Method calling
		
		System.out.println("My annual income is : "  + c.annualIncome()); // Return Type Method calling
	}
// find weekly, monthly and annual income 
	
	//void method 
	
	public void weeklyIncome(){
		int wI = hourlyIncome * 40;
		System.out.println("My Weekly income is : " + wI);
	}
	
	// Static Method 
	public static void monthlyIncome(){
		int mIncome = hourlyIncome * 320;
		System.out.println("My monthyl income is : " + mIncome);
	}
	
	// Return Type Method 
	public static int annualIncome(){
		int aIncome = hourlyIncome * 2000;
		return aIncome;
	}
	
	
	
	
	
	
	
	
	
	
}
