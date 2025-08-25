import java.util.Scanner;

public class QuotientRemainderCalculator {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Call the method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Print the results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
