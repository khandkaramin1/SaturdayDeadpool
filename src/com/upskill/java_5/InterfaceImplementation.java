package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door! ");
		
	}

	@Override
	public int iBus() {
		return 10;
	}

	@Override
	public String iTruck() {
		
		return "Greenline";
	}

	
/*
 		(Parent) 				(Keyword)				(Child)					(Keyword)				(GrandChild)											
 		Class 					Extends					Class
 		Abstract Class(+2)		Extends					Class(-2)
 		Interface(+2)			Implements				Class(-2)
 		Interface(+2)			Extends					Interface(+2)			Implements				Class(-4)
 
 */
	
	
}










