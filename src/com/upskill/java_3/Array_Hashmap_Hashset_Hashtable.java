package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		// Array store multiple data using index
		
		int age =30;  	//Variable holds one value
		int[] ageDeadpool = new int[]{25,21,35,30,40};		//Array holds multiple values

		String[] nameDeadpool = new String[]{"abdul","Mofiz","Sara","Garfield","Neimar"};
		
		//Array index 				[0] [1] [2] [3] [4]
		
		System.out.println("student Age :" + ageDeadpool[4]);
		System.out.println("Total Student :" + ageDeadpool.length);
		System.out.println("student name :" + nameDeadpool[2]);
		
		
		//nameCity
		String[] nameCity = new String[]{"NYC","Chicago","Sydney","Gainesville","Narnia"};
		System.out.println("city name :" + nameCity[1]);
		System.out.println("Total Student :" + nameCity.length);
	
		//multi-dimensional Array 
		
		int[][] ageUpskill2D = {{25,21,35,30,40},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
								{24,28,29,46}};		//[1][0] [1][1] [1][2] [1][3] [1][4]
		
		System.out.println("Student age 2D :" + ageUpskill2D[0][3]);
		
		// multi dimensional string for Array 
		String[][] nameUpskill2D = {{"Alex","Simon","Ryan","Max","Bob"},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
				{"Yun","Lee","Son","Lee"}};								//[1][0] [1][1] [1][2] [1][3] [1][4]

		System.out.println("Student name 2D :" + nameUpskill2D[0][3]);
		
		//hashmap store multiple data using key-value pair, 
		//implementation of Map interface 
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();   // Creating an object for the hashmap
		
		Student.put("Tanzu", 22);
		Student.put("Tahin", 21);
		Student.put("Masud", 24);
		Student.put("Shishir", 24);
		Student.put("Amin", 30);
		Student.put("Friend", 29);
		
		System.out.println("Hashmap Student Age:"+ Student.get("Tahin") );
		
		
		// Hashmap for country and capital 
		HashMap<String, String> countryCapital = new HashMap<String, String>();   // Creating an object for the hashmap
		
		countryCapital.put("USA", "Washington D.C.");
		countryCapital.put("Bangladesh", "Dhaka");
		countryCapital.put("India", "New Delhi");
		countryCapital.put("Indonesia", "Jakarta");
		countryCapital.put("Australia", "Canberra");
		countryCapital.put("Srilanka", "Colombo");
		
		System.out.println("Hashmap Country Capiatl :"+ countryCapital.get("Bangladesh"));
		
		
		// Hashset store unordered collection containing unique value-- it doesn't allow duplicate 
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car: "+ car);
		
		
		
		// capital Hashnet 
		HashSet<String> capital = new HashSet<String>();
		
		car.add("Dhaka");
		car.add("Tokyo");
		car.add("Delhi");
		car.add("D.C.");
		
		System.out.println("Capital : "+ capital);
		
		
		//Hashtable store multiple data using key-value pair, no duplicate, 
			// also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region:"+ Region.get("BD"));
		
		}
	
	}









