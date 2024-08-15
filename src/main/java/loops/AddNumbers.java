package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Sum: " + (num1 + num2));

            System.out.println("Would you like to run this again? Enter 'yes' or 'no': ");
            userResponse = scanner.next();  // Read the user's response

        } while (userResponse.equalsIgnoreCase("yes"));  // Check if the user wants to run again

        scanner.close();
    }
}
