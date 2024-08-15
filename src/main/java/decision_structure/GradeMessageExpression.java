package decision_structure;

import java.util.Scanner;

public class GradeMessageExpression {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        if (input.length() != 1) {
            System.out.println("Invalid input. Please enter a single letter grade.");
            return;
        }

        char grade = Character.toUpperCase(input.charAt(0));

        String message;
        switch (grade) {
            case 'A' -> message = "Outstanding!";
            case 'B' -> message = "Very Good!";
            case 'C' -> message = "Satisfactory.";
            case 'D' -> message = "Needs improvement!";
            case 'F' -> message = "Did not pass.";
            default -> {
                System.out.println("Invalid grade entered. Please enter a valid grade (A, B, C, D, F).");
                return;
            }
        }
        System.out.println(message);
    }
}
