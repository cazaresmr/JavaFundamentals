package decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        // Check if the input is a single character
        if (input.length() != 1) {
            System.out.println("Invalid input. Please enter a single letter grade.");
            return;
        }

        // Convert input to uppercase to handle lowercase entries
        char grade = Character.toUpperCase(input.charAt(0));

        // Initialize message variable
        String message;

        // Use a traditional switch statement
        switch (grade) {
            case 'A':
                message = "Outstanding!";
                break;
            case 'B':
                message = "Very Good!";
                break;
            case 'C':
                message = "Satisfactory.";
                break;
            case 'D':
                message = "Needs improvement!";
                break;
            case 'F':
                message = "Did not pass.";
                break;
            default:
                System.out.println("Invalid grade entered. Please enter a valid grade (A, B, C, D, F).");
                return;
        }

        // Print the message
        System.out.println(message);
    }
}
