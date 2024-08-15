package objects;

public class Rectangle {

    protected double length;
    protected double width;
    protected static final int SIDES = 4;  // Constant since it never changes

    // Constructor to initialize Rectangle with validated inputs
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Default constructor initializes to default non-zero values
    public Rectangle() {
        this(1, 1);  // Default to a 1x1 rectangle
    }

    // Calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Getters and Setters with validation
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive.");
        }
        this.width = width;
    }

    // Optional: Method to display Rectangle's details
    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, perimeter=%.2f, area=%.2f]",
                length, width, calculatePerimeter(), calculateArea());
    }
}
