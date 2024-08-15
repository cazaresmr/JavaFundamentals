package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        final double RATE = 15.0;
        final double MAX_HOURS = 40.0;
        final double MIN_HOURS = 0.0;

        Scanner scanner = new Scanner(System.in);
        double hoursWorked;

        do {
            System.out.println("Enter number of hours worked (between 0 and 40): ");
            hoursWorked = scanner.nextDouble();

            if (hoursWorked < MIN_HOURS || hoursWorked > MAX_HOURS) {
                System.out.println("Invalid entry. Hours worked must be between 1 and 40. Try again.");
            }
        } while (hoursWorked < MIN_HOURS || hoursWorked > MAX_HOURS);

        scanner.close();

        double grossPay = hoursWorked * RATE;
        System.out.println("Your gross pay is: $" + grossPay);
    }
}
