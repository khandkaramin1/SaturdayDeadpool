package com.upskill.assignment_1;

public class TrianglePerimeter {

	public static void main(String[] args) {
		// 1)A triangle three arms are: 5, 7 and 11 inches. 
		//Write a method to display the perimeter of triangle in console output.
		TrianglePerimeter obj = new TrianglePerimeter();		
		obj.Triangle();
	}

	//Void method
	public void Triangle(){
		int a = 5; 
		int b = 7;
		int c = 11;
		int sum = a+b+c;
		System.out.println("The Perimeter of the Triangle is : "+ sum);
	}
}
