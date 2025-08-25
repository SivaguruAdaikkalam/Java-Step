import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find string length without using length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Try to access characters until exception
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using next()
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call the custom method
        int customLength = findLength(input);

        // Call the built-in method
        int builtInLength = input.length();

        // Display results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);

        scanner.close();
    }
}
