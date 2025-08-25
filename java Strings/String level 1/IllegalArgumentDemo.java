import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException by using invalid substring indices
    public static void generateException(String text) {
        // This will throw StringIndexOutOfBoundsException (a subclass of RuntimeException)
        // And indirectly demonstrate incorrect argument logic
        String result = text.substring(5, 2); // start > end
        System.out.println("Substring: " + result);
    }

    // Method to handle the exception safely
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2); // start > end
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Generate exception
        System.out.println("\n=== Generating IllegalArgumentException ===");
        try {
            generateException(input);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle exception
        System.out.println("\n=== Handling IllegalArgumentException safely ===");
        handleException(input);

        scanner.close();
    }
}
