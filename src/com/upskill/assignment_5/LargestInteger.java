package com.upskill.assignment_5;

public class LargestInteger {

	
	    public static void main(String[] args) {
	        int[] a = {1, 5, 78, 265, 454, 8};
	        int largest = a[0];
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] > largest) {
	                largest = a[i];
	            }
	        }
	        System.out.println("Largest number in the array is: " + largest);
	    }
	}












	
/*This program uses a for loop to iterate through each element in the array starting from the second element.
It compares each element with a variable largest which is initially set to the first element of the array.
It checks whether the current element is greater than the current value of largest and if it is, assigns the current element to largest.
Finally, it prints the largest variable which will contain the largest number in the array.
You can see that, I've used an array of integers and the method I've used is the same as the previous one.
You can change the values of the array to find the largest integer from a different set of integers.*/




