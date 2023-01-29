package com.upskill.assignment_2_4_8;

public class Factorial {
	
		  public static void main(String[] args) {
		    int num = 7;
		    long factorial = 1;
		    for (int i = 1; i <= num; i++) {
		      factorial = factorial * i;
		    }
		    System.out.println("The factorial of 7 is: " + factorial);
		  }
		}










/*This program uses a for loop to iterate from 1 to 7, and 
calculates the factorial by multiplying the current value of factorial by the loop variable i. 
At the end of the loop, the final value of factorial is printed to the console.*/
