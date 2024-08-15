package objects;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        // Initialize the first room with default constructor
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of Room 1: " + areaOfRoom1);

        // Initialize the second room with parameterized constructor
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of Room 2: " + areaOfRoom2);

        // Calculate the total area
        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Total Area of Both Rooms: " + totalArea);
    }
}
