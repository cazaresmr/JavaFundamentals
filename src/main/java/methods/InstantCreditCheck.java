package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    // Constants for required salary and credit score
    private static final int REQUIRED_SALARY = 25000;
    private static final int REQUIRED_CREDIT_SCORE = 700;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getValidatedSalary();
        int creditScore = getValidatedCreditScore();
        SCANNER.close();

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        String message = qualified
                ? "Congratulations! Your loan is approved."
                : "Sorry, your loan was not approved.";
        System.out.println(message);
    }

    private static double getValidatedSalary() {
        double salary;
        while (true) {
            System.out.print("Enter your salary: ");
            if (SCANNER.hasNextDouble()) {
                salary = SCANNER.nextDouble();
                if (salary >= 0) {
                    break;
                } else {
                    System.out.println("Salary cannot be negative. Please enter a valid salary.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                SCANNER.next(); // Clear the invalid input
            }
        }
        return salary;
    }

    private static int getValidatedCreditScore() {
        int creditScore;
        while (true) {
            System.out.print("Enter your credit score: ");
            if (SCANNER.hasNextInt()) {
                creditScore = SCANNER.nextInt();
                if (creditScore >= 0 && creditScore <= 850) {
                    break;
                } else {
                    System.out.println("Credit score must be between 0 and 850. Please enter a valid credit score.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                SCANNER.next(); // Clear the invalid input
            }
        }
        return creditScore;
    }

    private static boolean isUserQualified(double salary, int creditScore) {
        return salary >= REQUIRED_SALARY && creditScore >= REQUIRED_CREDIT_SCORE;
    }
}
