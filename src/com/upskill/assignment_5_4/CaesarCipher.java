package com.upskill.assignment_5_4;

public class CaesarCipher {


	    public static final int N = 5;

	    public static String decode(String code) {
	        char[] codeArray = code.toCharArray();
	        for (int i = 0; i < codeArray.length; i++) {
	            if (Character.isLetter(codeArray[i])) {
	                codeArray[i] = (char)(codeArray[i] - N);
	                if (!Character.isLetter(codeArray[i])) {
	                    codeArray[i] = (char)(codeArray[i] + 26);
	                }
	            }
	        }
	        return new String(codeArray);
	    }

	    public static void main(String[] args) {
	        String encoded = "Hryy Hfrb!";
	        String decoded = decode(encoded);
	        System.out.println("Encoded: " + encoded);
	        System.out.println("Decoded: " + decoded);
	    }
	}

	
	



/*The method decode(String code) takes a string as input, and converts it into an array of characters using the toCharArray() method. 
 * It then iterates through the array, and for each character that is a letter, 
 * it subtracts N (5 in this case) from its ASCII value to get the original letter.
If the result is not a letter it adds 26 to rotate it back to the letter.

In the main method, I've encoded a string and demonstrate how to use the decode method by calling it 
and passing the encoded string as input and printing the output.*/