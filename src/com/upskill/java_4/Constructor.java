package com.upskill.java_4;

/*Constructor is instance of class, method same as class name, java will execute constructor first
- Constructor cannot be static or override nor void or return type.
- Default Constructor : No constructor is initialized
- Parameterized Constructor : Add different signature
- Constructor overloading : Different signature
*/

public class Constructor {
	String studentName;
	int studentAge;

	public Constructor(String name, int age){
	studentName = name;
	studentAge = age;
	}

	public Constructor(String name){
	studentName = name;
	}

	public Constructor(int age){
	studentAge = age;
	}

	public static void main(String[] args) {
	Constructor obj = new Constructor("Rasel", 30);
	System.out.println(obj.studentName);
	System.out.println(obj.studentAge);



	Constructor obj2 = new Constructor("Nazmul");
	System.out.println(obj2.studentName);

	Constructor obj3 = new Constructor(35);
	System.out.println(obj3.studentAge);
	}
	}

