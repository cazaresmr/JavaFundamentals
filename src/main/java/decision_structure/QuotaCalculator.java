package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;  // Sales quota for the week
        System.out.println("Enter the number of sales for the week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales < 0) {
            System.out.println("The number of sales cannot be negative.");
        } else if (sales >= quota) {
            System.out.println("Congratulations! You have met the weekly sales quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("Unfortunately, you did not meet the weekly sales quota. You were short " + salesShort + " sale(s).");
        }
    }
}
