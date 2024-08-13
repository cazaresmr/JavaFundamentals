package basic;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the number of hours worked: ");\
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter your hourly pay rate: ");
        double rate = scanner.nextDouble();
        scanner.close();
    }
}
