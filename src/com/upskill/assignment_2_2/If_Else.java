package com.upskill.assignment_2_2;

public class If_Else {

	public static void main(String[] args) {
		/* 2) A school conducts a 100 mark exam for its student and grades them as follows:
 	Grade:
 		Grade A: Marks>=90
 		Grade B: Marks>=80-89
 		Grade C: Marks>=70-79
 		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60

     Write a java program to calculate the grade for a student in a method passing 
     parameter for grade to display every grade type, using if..else statement.*/
		
		
			int Grade = 100;		//Global Variable
			
			if (Grade>=90){
				System.out.println("Your grade is A");}
				else if (Grade>=80 && Grade <=89){
					System.out.println("Your grade is B");}
					else if (Grade>=70 && Grade <=79){
						System.out.println("Your grade is C");}
					else if (Grade>=60 && Grade <=69){
						System.out.println("Your grade is D");}
					else { 
						System.out.println("Your grade is F");}
					}
					}
			

