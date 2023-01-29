package com.upskill.assignment_1_5;

import com.upskill.java_2.MethodType;

public class name_and_age {
	
	/* Write a java program which will display name and guestimated 
	age of every students in your class.(write separate method for every student).*/
	

	
	public static void main(String[] args) {
		System.out.println("Fahim's age is "+  fahimAge());
		System.out.println("Brian's age is "+  brianAge());
		System.out.println("Andrew's age is "+  andrewAge());
	}
	
	//Return Type Method
		public static int fahimAge(){     //static method --> you don't have to create an object. It belongs to the class.
			
			return 30;
		}

public static int brianAge(){
			
			return 19;
		}

public static int andrewAge(){
	
	return 28;
}}
