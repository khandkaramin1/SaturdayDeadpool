package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType {
	
	/*Polymorphism is the ability of an object to take in many forms.
	 * - Method Overloading (Compile time polymorphism / static bonding) same method name with different signature to overload
	 * - method override (Runtime polymorphism / dynamic binding) same method name from parent class to override. 
	 
	 */

	public static void main(String[] args) {
		
		
			car();
			car(1000);
			car("Moon");
			car(6, "single");
			
			Polymorphism obj = new Polymorphism();
			obj.annualIncome();
		}
		
		public void annualIncome(){
			System.out.println("My annual income is = 150000");
		}
		
		
		
		public static void car(){
			System.out.println("My car is Audi !");
		}

		public static void car(int hp){
			System.out.println("My car is Hummer ! " + "It has hp engine : " + hp);
		}
		
		public static void car(String roof){
			System.out.println("My car is BMW ! " + "It has roof : " + roof);
		}
		public static void car(int Battery, String motor){
			System.out.println("My car is Tesla ! " + "It has battery : " + Battery+ "It has Motor!" + motor);
		}
			
	}

