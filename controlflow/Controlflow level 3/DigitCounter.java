import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Initialize count variable
        int count = 0;
        int originalNumber = number; // Store the original number for display

        // Step 3: Handle case when number is 0 (since log-based methods fail for 0)
        if (number == 0) {
            count = 1;
        } else {
            // Step 4: Loop to count digits
            while (number != 0) {
                number /= 10; // Remove last digit
                count++; // Increment digit count
            }
        }

        // Step 5: Display the number of digits
        System.out.println("The number " + originalNumber + " has " + count + " digit(s).");

        scanner.close();
    }
}
