package com.upskill.assignment_2_4_6;

public class Prime_Number {

	public static void main(String[] args) {
		int x, y, isPrime, n;
        System.out.println("All Prime Numbers Between 1 to 100");
 
        // For every number between 2 to 100, check
        //  whether it is prime number or not
        for (x = 2; x <= 100; x++) {
            isPrime = 0;
            // Check whether i is prime or not
            for (y = 2; y <= x / 2; y++) {
                // If any number between 2 to i/2 divides i
                // completely then i cannot be prime number
                if (x % y == 0) {
                    isPrime = 1;
                    break;
                }
            }
 
            if (isPrime == 0)
                System.out.print(x + " ");
        }
 
    }
}

			

	


