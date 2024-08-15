package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 200;
        int quota = 10;

        System.out.println("Enter the number of sales made by the employee for the week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        // Input validation
        if (sales < 0) {
            System.out.println("Number of sales cannot be negative.");
        } else {
            // Check if the sales meet or exceed the quota
            if (sales >= quota) {
                salary += bonus;
                System.out.println("Congratulations! You've met the quota.");
            } else {
                System.out.println("Unfortunately, you didn't meet the quota.");
            }

            System.out.println("Salary: $" + salary);
        }

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
