import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize sum variable to store the sum of cubes of digits
        int sum = 0;
        int originalNumber = number; // Store the original number for comparison

        // Step 3: Loop through each digit of the number
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Compute the cube and add to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Step 4: Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        scanner.close();
    }
}
