package decision_structure;

import java.util.Scanner;

public class TestResults { // Class name updated to CamelCase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your test score: ");
        double score = scanner.nextDouble();
        scanner.close();

        // Validate input score
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            return;
        }

        char grade;

        // Determine grade based on score
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is: " + grade);
    }
}
