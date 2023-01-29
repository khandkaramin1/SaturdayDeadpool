package com.upskill.assignment_1_2;

public class RectanglePerimeter {

	public static void main(String[] args) {
		//2) A rectangle width and length are: 9 and 13 inches. 
		//Write a method to display the perimeter of rectangle in console output.
				
		rectangle();
	}
	
	//static method 
	
	public static void rectangle(){
		int a1 = 9;
		int b1 = 13;
		int sum1 = a1+b1;
		int Perimeter = 2*sum1;
		System.out.println("The Perimeter of the Rectangle is : " + Perimeter);
	}

}
