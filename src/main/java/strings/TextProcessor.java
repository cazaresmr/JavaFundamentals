package strings;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter a sentence to process:");
            String inputText = scanner.nextLine().trim();

            // Check if the input is valid
            if (inputText.isEmpty()) {
                System.out.println("Invalid input! Please enter a non-empty string.");
                return;
            }

            // Process the input text
            countWords(inputText);

            System.out.println("Reversed sentence:");
            System.out.println(reverseString(inputText));

            String spacedText = addSpaces("HeyWorld!It'sMeMichael");
            System.out.println("Text with added spaces:");
            System.out.println(spacedText);
        }
    }

    /**
     * Reverses the input string and returns it.
     *
     * @param text the string to be reversed
     * @return the reversed string
     */
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    /**
     * Adds spaces before each uppercase letter in the text (excluding the first letter) and returns the modified string.
     *
     * @param text the string to be modified
     * @return the modified string with spaces added
     */
    public static String addSpaces(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        for (int i = 1; i < modifiedText.length(); i++) { // Start at index 1 to avoid space before the first character
            if (Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++; // Move the index forward to avoid checking the space we just inserted
            }
        }
        return modifiedText.toString();
    }

    /**
     * Counts the words in the input string and prints each word along with the total word count.
     *
     * @param text the string whose words are to be counted
     */
    public static void countWords(String text) {
        String[] words = text.split("\\s+");
        int wordCount = words.length;

        System.out.printf("Words: %s%n", String.join(", ", words));
        System.out.printf("Total number of words: %d%n", wordCount);
    }


// Text Blocks
//return """
    //    [
        //    {
            //    "id": 13344,
            //    "customerID": 12212,
            //    "type": "CHECKING",
            //    "balance": 3821.93
        //    }
    //    ]
//"""

//return """
//        Hey y'all!
//        """;

}
