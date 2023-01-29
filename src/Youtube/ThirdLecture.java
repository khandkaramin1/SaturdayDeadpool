package Youtube;

public class ThirdLecture {

	public static void main(String[] args) {
		String myName;
		// Initializing my name 
		myName = new String("ABCD"); 
		
		
		int a =10;
		myName = new String("AB   CD:"); 
		
		
		
		System.out.println(myName);
		prln("The number of charecters in your name is: " + myName.length());
		prln("This is our new method");
		prln(myName);
		
		//Array declaration [] --> one dimensional 
		//[][] --> Two dimensional 
		// [][][] --> Three dimensional arrays 
		
		int [][] twoDArray = new int [2][3];
		twoDArray [0][0] = 1;
		twoDArray [0][1] = 1;
		twoDArray [0][2] = 1;
		twoDArray [1][0] = 1;
		twoDArray [1][1] = 1;
		twoDArray [1][2] = 1;
		
		
	}

	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}
	
}
