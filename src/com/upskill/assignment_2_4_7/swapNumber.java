package com.upskill.assignment_2_4_7;

public class swapNumber {
	
	/*You are given two integer number (a=25, b=30), write a program to swap them and 
    	display result on the screen.*/
	
	 public static void main(String[] args) {
		    int a = 25;
		    int b = 30;
		    int temp;								// Declaring temporary variable

		    // Swap the values of a and b
		    temp = a;
		    a = b;
		    b = temp;

		    // Display the result
		    System.out.println("My New Number, a = " + a + " and b = " + b);
		  }
		}


