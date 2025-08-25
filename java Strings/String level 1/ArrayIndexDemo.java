import java.util.Scanner;

public class ArrayIndexDemo {

    // Method that generates ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        // Accessing an invalid index
        System.out.println("Accessed Name: " + names[index]);
    }

    // Method that handles ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessed Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException! Invalid array index: " + index);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Take user input for index
        System.out.print("Enter an index to access (0 to 4): ");
        int userIndex = scanner.nextInt();

        // Generate the exception
        System.out.println("\n=== Generating ArrayIndexOutOfBoundsException ===");
        try {
            generateException(names, userIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle the exception safely
        System.out.println("\n=== Handling ArrayIndexOutOfBoundsException safely ===");
        handleException(names, userIndex);

        scanner.close();
    }
}
