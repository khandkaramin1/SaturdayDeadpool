package com.upskill.java_2;

public class IfElseStateStatement {

	//conditional statement
	public static void main(String[] args) {
		int age = 101;
		
		if (age<=13){
			System.out.println("You are a children");
		} 
		else if (age>13 && age <18){
			System.out.println("You are a teenager");
		} 
		else if (age >= 60){
			if(age>100){
				System.out.println("You are a Champion!");
			} 
			else
			System.out.println("You are a Senior");
		}
		else {
			System.out.println("you are an adult");
		}

	}
}


// nested if else 


//or example, assigning grades (A, B, C) based on the percentage obtained by a student.

//if the percentage is above 90, assign grade A
//if the percentage is above 75, assign grade B
//if the percentage is above 65, assign grade C


/*public static void main(String[] args) {
	int Grade = 85;
	
	if (Grade>90){
		System.out.println("Your grade is A");
		else if (Grade>75){
			System.out.println("Your grade is B");
			else if (Grade>65){
				System.out.println("Your grade is C");
			}
		}
	}*/
