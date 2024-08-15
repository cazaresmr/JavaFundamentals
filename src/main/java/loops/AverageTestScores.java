package loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AverageTestScores {

    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 24;
        final int NUMBER_OF_TESTS = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            double totalScore = 0;
            System.out.println("Entering scores for Student #" + (i + 1));

            for (int j = 0; j < NUMBER_OF_TESTS; j++) {
                double score = getValidScore(scanner, j + 1);
                totalScore += score;
            }

            double averageScore = totalScore / NUMBER_OF_TESTS;
            System.out.printf("The test average for Student #%d is %.2f%n", (i + 1), averageScore);
        }

        scanner.close();
    }

    private static double getValidScore(Scanner scanner, int testNumber) {
        double score = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.printf("Enter score (0-100) for Test #%d: ", testNumber);
            try {
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Score must be between 0 and 100. Please enter a valid score.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // clear the invalid input
            }
        }

        return score;
    }
}
