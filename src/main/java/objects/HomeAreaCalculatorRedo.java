package objects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {  // Using try-with-resources for automatic resource management

            Rectangle room1 = getRoom(scanner);
            Rectangle room2 = getRoom(scanner);

            double totalArea = room1.calculateArea() + room2.calculateArea();
            System.out.println("Total Area of Both Rooms: " + totalArea);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numerical values only.");
        }
    }

    public static Rectangle getRoom(Scanner scanner) {
        double roomLength;
        double roomWidth;

        while (true) {
            try {
                System.out.print("Enter the room's length: ");
                roomLength = scanner.nextDouble();
                if (roomLength <= 0) {
                    System.out.println("Length must be positive. Please try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();  // Clear the invalid input
            }
        }

        while (true) {
            try {
                System.out.print("Enter the room's width: ");
                roomWidth = scanner.nextDouble();
                if (roomWidth <= 0) {
                    System.out.println("Width must be positive. Please try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();  // Clear the invalid input
            }
        }

        return new Rectangle(roomLength, roomWidth);
    }
}
