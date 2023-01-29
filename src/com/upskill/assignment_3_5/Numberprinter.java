package com.upskill.assignment_3_5;

public class Numberprinter {
/* Dingdong program : Write a Java program that prints the numbers from 1 to 50.
 *  But for multiples of three prints "Ding" instead of the number and for the multiples 
 *  of five prints "Dong". For numbers which are multiples of both three and five print "Dingdong"
 * 
 */
	
	    public static void main(String[] args) {
	        for (int i = 1; i <= 50; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("Dingdong");
	            } else if (i % 3 == 0) {
	                System.out.println("Ding");
	            } else if (i % 5 == 0) {
	                System.out.println("Dong");
	            } else {
	                System.out.println(i);
	            }
	        }
	    }
	}



















/*This program uses a for loop to iterate from 1 to 50, and in each iteration, 
 * it checks if the current value of the variable i is divisible by 3 and 5 using 
 * the modulus operator (%) . If it is divisible by 3 and 5 it prints "Dingdong". 
 * If it's divisible by 3 it prints "Ding" and if it's divisible by 5 it prints "Dong". 
 * If it's not divisible by 3 or 5, the program prints the current value of the variable i.*/
