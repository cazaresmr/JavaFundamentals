package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }

    private static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Please enter your name: ");
            name = scanner.nextLine().trim();

            if (name.isBlank()) {
                System.out.println("Name cannot be empty. Please try again.");
            }
        }

        return name;
    }

    private static void greetUser(String name) {
        System.out.println("Hi there, " + name + "!");
    }
}
