package com.upskill.assignment_3_4;


	class Shape {
	    public void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	class Rectangle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a rectangle");
	    }
	}

	class Circle extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a circle");
	    }
	}

	public class Poly {
	    public static void main(String[] args) {
	        Shape s1 = new Rectangle();
	        Shape s2 = new Circle();
	        s1.draw(); // Output: Drawing a rectangle
	        s2.draw(); // Output: Drawing a circle
	    }
	}


