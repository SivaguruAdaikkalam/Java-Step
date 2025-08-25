import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize sum variable
        int sum = 0;
        int originalNumber = number; // Store the original number for comparison

        // Step 3: Calculate the sum of digits
        while (originalNumber > 0) {
            int digit = originalNumber % 10; // Extract the last digit
            sum += digit; // Add it to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Step 4: Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}
