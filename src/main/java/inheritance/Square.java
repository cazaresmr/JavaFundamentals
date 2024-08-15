package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {

    // Constructor to initialize Square with side length
    public Square(double side) {
        super(side, side); // A square has equal length and width
    }

    // Default constructor initializes to default non-zero values
    public Square() {
        this(1);  // Default to a 1x1 square
    }

    // Override setLength to ensure width is also updated
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    // Override setWidth to ensure length is also updated
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    // Method to set both length and width to the same value
    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.length = side;
        this.width = side;
    }

    // Override the toString method for better output
    @Override
    public String toString() {
        return String.format("Square[side=%.2f, perimeter=%.2f, area=%.2f]",
                length, calculatePerimeter(), calculateArea());
    }
}
