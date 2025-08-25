import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method that generates StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Access index beyond string length (e.g., text.length())
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method that handles StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Invalid index accessed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Call method that generates exception
        System.out.println("\n=== Generating StringIndexOutOfBoundsException ===");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Call method that handles exception
        System.out.println("\n=== Handling StringIndexOutOfBoundsException safely ===");
        handleException(input);

        scanner.close();
    }
}
