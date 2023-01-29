package com.upskill.assignment_4_5;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String s1 = "CARE";
		String s2 = "RACE";
		
		// converting to character array
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		// checking length of both string
		if (c1.length != c2.length){
		System.out.println("Not array");
		System.exit(0);}
		
		//Sorting array
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		for(int i =0; i< c1.length; i++);
		{
			int i = 0;
			if (c2[i] != c2[i])
			{
				System.out.println("Not Anagram");
				System.exit(0);
			}}
		System.out.println("Anagram");
			}
	{
		
		
	}

}
