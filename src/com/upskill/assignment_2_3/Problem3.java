package com.upskill.assignment_2_3;

public class Problem3 {
	public static int a;
	public static int b;
	
	public static void main(String[] args) {
		a = myFunction1();
		b = myFunction2();
		myMethod();
		
	}
	
	public static int myFunction1(){
		return 85;
	}
	public static int myFunction2(){
		return 65;
	}
	public static void myMethod(){
		if (a>b);{
			System.out.println("1st Function is bigger then 2nd Function");}
		if (a<b);{
			System.out.println("2nd Function is bigger then 1st Function");}
	}
}


