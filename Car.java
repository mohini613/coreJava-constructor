package com.Constructor;

public class Car {
    String brand;
    int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand; // Initialize the brand attribute with the passed value
        this.year = year; // Initialize the year attribute with the passed value
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object of Car class using the constructor
        Car myCar = new Car("Toyota", 2022);
        
        // Calling a method to display car information
        myCar.displayInfo();
    }
}
