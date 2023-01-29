package com.upskill.assignment_5_2;

	public class FizzBuzz {
		
		
	    public static String getFizzBuzz(int num) {
	        if (num % 3 == 0 && num % 5 == 0) {
	            return "FizzBuzz";
	        } else if (num % 3 == 0) {
	            return "Fizz";
	        } else if (num % 5 == 0) {
	            return "Buzz";
	        } else {
	            return Integer.toString(num);
	        }
	    }

	    public static void main(String[] args) {
	        for (int i = 1; i <= 100; i++) {
	            System.out.println(getFizzBuzz(i));
	        }
	    }
	}
	
	
	
	
	
	
	
	/*In this example, I created a class called FizzBuzz, and in this class, I've defined a method called getFizzBuzz(int num) 
	  which takes an integer as input and returns the output according to the conditions mentioned in the question.
	It also includes a main method to demonstrate the usage of the getFizzBuzz 
	method by printing the output for the numbers 1 to 100.
	It will print "Fizz" for multiples of three, "Buzz" for multiples of five, "FizzBuzz" for multiples of both three and five, 
	and the input number for numbers that are neither.*/

