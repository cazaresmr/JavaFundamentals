package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6; // Length of the lottery ticket
    private static final int MAX_TICKET_NUMBER = 69; // Maximum number on the ticket

    public static void main(String[] args) {
        int[] ticket = generateNumbers(); // Generate the lottery ticket numbers
        printTicket(ticket); // Print the generated ticket
    }

    // Generates an array of unique random numbers for the lottery ticket
    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
                // Generates a number between 1 and MAX_TICKET_NUMBER
            } while (search(ticket, randomNumber)); // Repeat if the number is already in the ticket

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    // Checks if a number already exists in the array
    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) return true; // Number found in the array
        }
        return false; // Number not found
    }

    // Sorts and prints the lottery ticket numbers
    public static void printTicket(int[] array) {
        Arrays.sort(array); // Sort the ticket numbers
        for (int number : array) {
            System.out.print(number + " | "); // Print each number separated by " | "
        }
    }
}
