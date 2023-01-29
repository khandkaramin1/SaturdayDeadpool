package com.upskill.java_2;

public class MethodTypePractice {
/* There are three method types
 * 1) Static 
 * 2) Void 
 * 3) Return type 
 */
	
	public static int hourlyIncome = 40;   //Global or instance Variable
	
	public static void main(String[] args) {
		MethodTypePractice obj = new MethodTypePractice();
		obj.weeklyIncome();
		monthlyIncome();
		System.out.println(("My bimonthly income is " + obj.biMonthlyincome() ));

	}

	//Void Method
	
	public void  weeklyIncome(){
		int calculateWeeklyincome = hourlyIncome*40;
		System.out.println(("My weekly income is " + calculateWeeklyincome ));
	}
	
	
	//Static method 
	
	public static void monthlyIncome(){
		int calculateMonthlyincome = hourlyIncome*2000;
		System.out.println(("My monthly income is " + calculateMonthlyincome ));
		}
	
	//Return Method 
	
	public static int biMonthlyincome(){
		int calculateBimonthlyincome = hourlyIncome* 4000;
		return calculateBimonthlyincome;
	}
	
	
}
	

