package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items to scan: ");
        int quantity = scanner.nextInt();
        if (quantity <= 0) {
            System.out.println("The number of items must be greater than zero.");
            return;
        }

        double total = calculateTotal(scanner, quantity);

        System.out.printf("Your total is: $%.2f.%n", total);
        scanner.close();
    }

    private static double calculateTotal(Scanner scanner, int quantity) {
        double total = 0;

        for (int i = 1; i <= quantity; i++) {
            System.out.printf("Enter the cost of item %d: ", i);
            double price = scanner.nextDouble();
            if (price < 0) {
                System.out.println("Item price cannot be negative.");
                i--; // Prompt the user again for this item
            } else {
                total += price;
            }
        }

        return total;
    }
}
