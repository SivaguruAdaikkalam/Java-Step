import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative check
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse using charAt(), compare with toCharArray()
    public static boolean isPalindromeUsingReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reverse = new char[len];
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        return reverse;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Normalize input if needed (optional): remove spaces, lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Logic 1
        boolean result1 = isPalindromeIterative(normalized);
        // Logic 2
        boolean result2 = isPalindromeRecursive(normalized, 0, normalized.length() - 1);
        // Logic 3
        boolean result3 = isPalindromeUsingReverse(normalized);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Iterative Method: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursive Method: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Reverse Array Method: " + (result3 ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}
