import java.util.Scanner;

public class NumberFormatDemo {

    // Method that generates NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if the input is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method that handles NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException! '" + text + "' is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call method that generates the exception
        System.out.println("\n=== Generating NumberFormatException ===");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Call method that handles the exception
        System.out.println("\n=== Handling NumberFormatException safely ===");
        handleException(input);

        scanner.close();
    }
}
