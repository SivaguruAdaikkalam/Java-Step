import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true; // Variable to store the result

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to num - 1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // If divisible by any number other than 1 and itself
                    isPrime = false;
                    break; // Exit the loop early
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}
