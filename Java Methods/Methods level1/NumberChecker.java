import java.util.Scanner;

public class NumberChecker {

    // Method to check the sign of the number
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the method
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
