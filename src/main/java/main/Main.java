package main;

import inheritance.Square;

public class Main {
    public static void main(String[] args) {
        // Test default constructor
        Square defaultSquare = new Square();
        System.out.println("Default Square: " + defaultSquare);

        // Test parameterized constructor
        Square customSquare = new Square(5);
        System.out.println("Custom Square: " + customSquare);

        // Test setters
        customSquare.setSide(10);
        System.out.println("Updated Custom Square: " + customSquare);
    }
}
