import java.util.Scanner;

public class UpperCaseConverter {

    // Method to convert lowercase letters to uppercase using ASCII logic
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));  // Convert to uppercase
            } else {
                result.append(ch);  // Leave other characters unchanged
            }
        }

        return result.toString();
    }

    // Method to compare two strings character-by-character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input from the user
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Convert using custom method
        String customUpper = toUpperCaseCustom(input);

        // Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // Compare the two results
        boolean areEqual = compareStrings(customUpper, builtInUpper);

        // Display results
        System.out.println("\nCustom Uppercase:   " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both equal?     " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}
