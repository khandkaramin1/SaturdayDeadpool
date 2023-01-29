package com.upskill.assignment_4_1;

public class Encapsulation {
	private String username;
	private String password;
	private String email;
	private String FN = "John";
	private String LN = "Cena";
	
	public static void main(String[] args) {
		/*Write a user program using encapsulation that contains the username, password, email, first and last names 
		 * of a user of our application. Display the user information in console output?*/

		Encapsulation obj = new Encapsulation();
		obj.setUsername("John.Cena");
		System.out.println("Username : " + obj.getUsername());
		
		obj.setPassword("You can't see me");
		System.out.println("Password : " + obj.getPassword());
		
		obj.setEmail("johncena2020@gmail.com");
		System.out.println("Email : " + obj.getEmail());
		
		obj.setFN("John");
		System.out.println("First Name : " + obj.getFN());
		
		obj.setFN("Cena");
		System.out.println("Last Name : " + obj.getLN());
		
		
		
	}
	
	//Setter Method - Username
	public void setUsername(String value){
		username = value;
	}
	// Getter Method - Username
	public String getUsername(){
		return username;
	}

	//Setter Method - Password 
	public void setPassword(String value){
		password = value;
	
	
}
	// Getter Method - Password
		public String getPassword(){
			return password;
		}
		
	//Setter Method - Email 
		public void setEmail(String value){
			email = value;
		}
			
	// Getter Method - Email
			public String getEmail(){
				return email;
			}
		
	//Setter Method - First name 
			public void setFN(String value){
				FN = value;
			}	
		
	// Getter Method - Email
		public String getFN(){
			return FN;
						}	
		
		//Setter Method - Last name 
		public void setLN(String value){
			LN = value;
		}	
		// Getter Method -Last Name
				public String getLN(){
					return LN;
								}	
		
		
		
		
		
}
