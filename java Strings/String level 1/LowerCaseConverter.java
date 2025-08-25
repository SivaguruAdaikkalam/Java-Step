import java.util.Scanner;

public class LowerCaseConverter {

    // Method to convert uppercase letters to lowercase using ASCII logic
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));  // Convert to lowercase
            } else {
                result.append(ch);  // Keep non-uppercase characters unchanged
            }
        }

        return result.toString();
    }

    // Method to compare two strings character-by-character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input from the user
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Convert using custom method
        String customLower = toLowerCaseCustom(input);

        // Convert using built-in method
        String builtInLower = input.toLowerCase();

        // Compare the two results
        boolean areEqual = compareStrings(customLower, builtInLower);

        // Display results
        System.out.println("\nCustom Lowercase:   " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both equal?     " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}
