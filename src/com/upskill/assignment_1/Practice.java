package com.upskill.assignment_1;

public class Practice {

	public static void main(String[] args) {
		// 1)A triangle three arms are: 5, 7 and 11 inches. 
				//Write a method to display the perimeter of triangle in console output.
		Practice obj = new Practice();
		obj.arms();
	
	}

	//Void Method 
		// In void method we use the word void after access modifier, 
		//and we use system.out.println in the void method. We call the method in main method, in order
		// to call we create an object first and then we call it. 
	public void arms(){
		int a = 5;
		int b = 7;
		int c = 11;
		int sum = a+b+c;
		System.out.println("The Perimeter of the triangle is : " + sum);
	}
	
	
	
}
