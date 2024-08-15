package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of hours worked: ");
        int hours = scanner.nextInt();
        if (hours < 0) {
            System.out.println("Hours worked cannot be negative.");
            return;
        }

        System.out.println("Enter your hourly pay rate: ");
        double rate = scanner.nextDouble();
        if (rate < 0) {
            System.out.println("Hourly pay rate cannot be negative.");
            return;
        }

        scanner.close();

        double grossPay = hours * rate;

        System.out.println("Gross Pay: " + grossPay);
    }
}

