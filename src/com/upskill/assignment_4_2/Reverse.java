package com.upskill.assignment_4_2;

public class Reverse {

	//ReverseString using CharcterArray.

	public static void main(String[] arg) {

	// declaring variable

	String stringinput = "Cricket";

	        // convert String to character array

	        // by using toCharArray

	        char[] resultarray = stringinput.toCharArray();

	        //iteration

	        for (int n = resultarray.length - 1; n >= 0; n--)

	         // print reversed String

	            System.out.print(resultarray[n]);

	}
	
}
