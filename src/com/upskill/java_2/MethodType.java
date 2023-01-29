package com.upskill.java_2;

public class MethodType {
	
	/* Types of Methods:
	 * 1.Void Method / non static method
	 * 2. Static Method
	 * 3. Return Type Method 
	 */
	public static int hourlyIncome = 65;   //Global or instance variable
	
	public static void main(String[]args){  // Java runs main method
		MethodType obj = new MethodType();		//creating object 
		obj.annualIncome();
		obj.BiannualIncome();
		
		weeklyIncome();
		BiweeklyIncome();
		
		System.out.println("My monthly income =" + obj.monthlyIncome());
		System.out.println("My Bi monthly income =" + obj.BimonthlyIncome());
		;
		
	}
//Void Method 
	public void annualIncome(){  	// void means non static, so create object 
		int calculateAnnualIncome = hourlyIncome*2000;
		System.out.println("My Annual Income=" + calculateAnnualIncome);
	
	}

	//Static Method    For static method we don't have to create an object
	public static void weeklyIncome(){   //Public static void method
	int calculateWeeklyIncome = hourlyIncome * 40;
	System.out.println("My Weekly Income =" + calculateWeeklyIncome);
	}
	
	//Return Type Method
	public int monthlyIncome(){
		int calculateMonthlyIncome = hourlyIncome *180;
		return calculateMonthlyIncome;
	}
	
	// bi weekly, bi monthly, and bi yearly methods
	//Bi Annual 
	public void BiannualIncome(){   
		int calculateBiAnnualIncome = hourlyIncome*4000;
		System.out.println("My Bi Annual Income=" + calculateBiAnnualIncome);
	}
	//Bi Weekly
	public static void BiweeklyIncome(){   //Public static void method
		int calculateBiWeeklyIncome = hourlyIncome * 80;
		System.out.println("My Bi Weekly Income =" + calculateBiWeeklyIncome);
		}
	//Bi Monthly
	
	public int BimonthlyIncome(){
		int calculateBiMonthlyIncome = hourlyIncome *360;
		return calculateBiMonthlyIncome;
	}}

	
/*public void Amin (){			//Method
	String name = "Amin Khandkar";		//Variable
	int Age = 31;
	
	}
}*/


//write down a static return type method? 

/*static String newmethod (){
	string name = "Amin"
			return name; 
}*/

//Write down a static int return type method

/*public int monthlyIncome(){
	int calculateMonthlyIncome = hourlyIncome *180;
	return calculateMonthlyIncome;
	
	public int weeklyIncome(){
		int calculateWeeklyincome = hourlyIncome * 80;
		return calculateWeeklyincome;
	}
*/


