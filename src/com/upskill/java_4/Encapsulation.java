package com.upskill.java_4;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "Upskill";	//write and read
	private int ssn = 585478547;		// write only
	private String username = "Ryan Harris";	//read only
	
	
	
	public static void main(String[] args) {

		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
	}
	
	//Setter method - name				//set the data, write
	public void setName(String value){
		name = value;
	}
	
	// Getter method -- name 
	
	public String getName(){
		return name;
	}
	
	//setter method --ssn 
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method-- username
	public void getUsername(){
		return username;
	}
	
}