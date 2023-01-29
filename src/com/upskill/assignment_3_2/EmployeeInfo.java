package com.upskill.assignment_3_2;

import java.util.HashMap;

public class EmployeeInfo {
	//Write a java program which will display 5 employee information(name, age, salary and address).
	
		  public static void main(String[] args) {
		    HashMap<String, String> employees = new HashMap<>();
		    employees.put("Brian Davis", "35,45000,45 S Brian ST");
		    employees.put("Rasel Brown", "32,40000,158 Market Ave");
		    employees.put("Bob Johnson", "28,38000,789 Pine St");
		    employees.put("Samantha Brown", "25,35000,321 Maple St");
		    employees.put("Michael Rodriguez", "33,42000,159 Oak St");

		    int i = 1;
		    for (HashMap.Entry<String, String> entry : employees.entrySet()) {
		      System.out.println("Employee " + i + " Information:");
		      System.out.println("Name: " + entry.getKey());
		      String[] info = entry.getValue().split(",");
		      System.out.println("Age: " + info[0]);
		      System.out.println("Salary: $" + info[1]);
		      System.out.println("Address: " + info[2]);
		      System.out.println();
		      i++;
		    }
		  }
		}















/*This program creates a HashMap called employees that stores the name and other information for each employee as a string. 
 * The main method loops through the entries in the HashMap, using the split method to extract the individual pieces of 
 * information from the string. 
 * It then prints out the name and each piece of information for each employee.*/
