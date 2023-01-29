package Exercise;

public class Problem2 {

	
	public static void main(String[] args) {
		/*.   Write a java program following below:

		a.   A method which multiply with two numbers and show in output

		b.   Another method with holding two variables which will display your first name and last name on the screen.
		
		c. use return method, a= 3, b= 4. multply a*b	*/

		Problem2 obj = new Problem2();
		obj.A();
	
		B();
		
		System.out.println("My Solution is :" + obj.C());
	}

	// Void Method 
	
	public void A(){
		int a = 12;
		int b = 2;
		int multiplication = a*b;
		System.out.println("My Solution is : " + multiplication);
	}
	
	// Static Method 
	
	public static void B(){
		String First_Name = "Amin";
		String Last_Name = "Khandkar";
		System.out.println("My Solution is : " + First_Name  + Last_Name);
	}
	
	// Return Method 
	
	public int C(){
		int a = 3;
		int b = 4;
		int m = a*b;
		return m;
	}
	
}
