package Exercise;

public class problem1 {

	public static void main(String[] args) {
		/* 1.   Write a java equation class and print the 
		 * value of b-a and c-b in separate method where a=10, b = 15 and c = 20;
		 */

		problem1 obj = new problem1();
		obj.sol();
		
		sol1();
		
		
	}

	// void method 
	
	public void sol(){
		int a =10;
		int b = 15; 
		int c = 20;
		int sub = b-a;
		int sub1 = c-b;
		System.out.println(" b-a is : " + sub);

	}
	
	public static void sol1(){
		int b = 15; 
		int c = 20;
		int sub1 = c-b;
		System.out.println(" c-b is : " + sub1);
	}
	
}
