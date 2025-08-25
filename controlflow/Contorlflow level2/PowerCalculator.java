import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for base number and exponent
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the exponent (power): ");
        int power = scanner.nextInt();
        
        int result = 1; // Initialize result to 1
        
        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the base number in each iteration
        }
        
        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        scanner.close(); // Close the scanner
    }
}

