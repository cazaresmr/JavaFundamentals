package methods;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            return;
        }

        Month monthObj = new Month();
        String monthName = monthObj.getMonthName(monthNumber);
        System.out.println("The month is: " + monthName);

        System.out.println("Enter the month name: ");
        String monthNameInput = scanner.nextLine();
        int monthIndex = monthObj.getMonthNumber(monthNameInput);

        if (monthIndex == -1) {
            System.out.println("Invalid month name. Please enter a valid month name.");
        } else {
            System.out.println("The month number is: " + monthIndex);
        }

        scanner.close();
    }

    public String getMonthName(int monthNumber) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[monthNumber - 1];
    }

    public int getMonthNumber(String monthName) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i + 1;
            }
        }

        return -1; // Return -1 if the month name is invalid
    }
}
