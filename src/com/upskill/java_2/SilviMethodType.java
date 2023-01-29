package com.upskill.java_2;

public class SilviMethodType {
	
	//Global Variable
	
		public static int hourlyIncome = 10; 

	public static void main(String[] args) {
		//calling void method
		SilviMethodType obj = new SilviMethodType();
		obj.monthlyIncome(); 
		// calling static method
		yearlyIncome();
		// Calling Return Method
		//System.out.println("My bimonthly income"+ obj.biMonthlyIncome());
		obj.biMonthlyIncome();
		
	}
	// An employee makes 10 dollars an hour. Find monthly income, yearly income, and bi-monthly income.  
	
	
	
	// Void Type 
	
	public void monthlyIncome(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		System.out.println("My Monthly income is " + calculateMonthlyIncome );
	}
	
	// Static Method 
	 public static void yearlyIncome(){          // Method declaration 
		 int calculateYearlyIncome = hourlyIncome * 2000;
		 System.out.println("My Yearly income is " + calculateYearlyIncome );
	 }

	 // Return type method 
	 
	 public static int biMonthlyIncome(){    		// return method because, it doesn't have VOID --> Method declaration
		 int calculatebiMonthlyIncome = hourlyIncome *360;
		 System.out.println("My bimonthly income");
		 return calculatebiMonthlyIncome;
		
	 }
}
