import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // ASCII size

        // First pass: count character frequencies
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                frequency[ch]++;
            } catch (Exception e) {
                break; // reached end of string
            }
        }

        // Second pass: find the first character with frequency 1
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (frequency[ch] == 1) {
                    return ch;
                }
            } catch (Exception e) {
                break; // reached end of string
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
