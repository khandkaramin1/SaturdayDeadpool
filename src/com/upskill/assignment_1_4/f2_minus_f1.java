package com.upskill.assignment_1_4;

public class f2_minus_f1 {

	public static void main(String[] args) {
		
		//A function returns 30, another function returns 50. 
		//Write a java program which will display subtraction value from bigger number to smaller.
		
		f2_minus_f1 obj = new f2_minus_f1();
		obj.value();
	}

	//void method 
	public void value(){
		int f1 = 30;
		int f2 = 50; 
		int x = f2-f1;
		System.out.println("My Solution is : " + x);
	}
}
