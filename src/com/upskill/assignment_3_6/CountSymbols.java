package com.upskill.assignment_3_6;

public class CountSymbols {

	
	    public static void main(String[] args) {
	        String str = "A quick brown fox jumps over the lazy dog";
	        int vowels = 0, consonants = 0, digits = 0, tabs = 0, spaces = 0;
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowels++;
	            } else if ((ch >= 'a' && ch <= 'z') && (ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')) {
	                consonants++;
	            } else if (ch >= '0' && ch <= '9') {
	                digits++;
	            } else if (ch == '\t') {
	                tabs++;
	            } else if (ch == ' ') {
	                spaces++;
	            }
	        }
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	        System.out.println("Digits: " + digits);
	        System.out.println("Tabs: " + tabs);
	        System.out.println("Spaces: " + spaces);
	    }
	}

	






/*This program will count the number of vowels, consonants, digits, tabs, and blank spaces in the given string.
It starts by converting the string to lowercase using the toLowerCase() method so that the program can handle 
uppercase and lowercase vowels.Then, the program iterates through each character in the string using a for 
loop and a nested if-else statement to check whether the character is a vowel, consonant, digit, tab, or space. 
Each time the program encounters a character that matches one of these conditions, it increments 
the corresponding counter variable. Finally, the program prints the final count of each symbol.*/
