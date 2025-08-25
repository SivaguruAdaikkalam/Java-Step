import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add i to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner object

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt(); // Get user input

        if (n > 0) {
            int result = findSum(n); // Call method
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a positive number.");
        }

        scanner.close(); // Close scanner
    }
}
