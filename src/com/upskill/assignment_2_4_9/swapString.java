package com.upskill.assignment_2_4_9;

public class swapString {
	
	public static void main(String[] args) {
	    String a = "Talen";
	    String b = "Tech";
	    System.out.println("Before swapping: a = " + a + ", b = " + b);
	    
	    // Swap the values of a and b
	    String temp = a;
	    a = b;
	    b = temp;
	    
	    System.out.println("After swapping: a = " + a + ", b = " + b);
	  }
	}












/*It declares two string variables a and b and assigns them the values "Talen" and "Tech", respectively. 
 * It then prints the values of a and b to the console.
 * Next, a temporary string variable temp is used to store the value of a. 
 * The value of b is then assigned to a, and the value of temp (which is the original value of a) is assigned to b. 
 * This effectively swaps the values of a and b.
 * Finally, the program prints the values of a and b again, this time showing the swapped values. */
