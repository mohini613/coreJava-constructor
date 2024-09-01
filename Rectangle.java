package com.Constructor;
//using multiple class we can create constructor called constructor overloading


	public class Rectangle {
	    private int length;
	    private int width;

	    // Constructor 1: No parameters
	    public Rectangle() {
	        this.length = 0; // Default length
	        this.width = 0; // Default width
	    }

	    // Constructor 2: Parameters for length and width
	    public Rectangle(int length, int width) {
	        this.length = length; // Initialize length with provided value
	        this.width = width; // Initialize width with provided value
	    }

	    // Constructor 3: Parameter for length only
	    public Rectangle(int length) {
	        this.length = length; // Initialize length with provided value
	        this.width = length; // Make width equal to length (assuming a square)
	    }

	    // Method to calculate area
	    public int calculateArea() {
	        return length * width;
	    }

	    public static void main(String[] args) {
	        // Creating objects using different constructors
	        Rectangle rectangle1 = new Rectangle(); // Using constructor 1
	        Rectangle rectangle2 = new Rectangle(5, 3); // Using constructor 2
	        Rectangle square = new Rectangle(4); // Using constructor 3

	        // Displaying areas of the rectangles
	        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
	        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
	        System.out.println("Area of square: " + square.calculateArea());
	    }
	}


