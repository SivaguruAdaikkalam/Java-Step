import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is greater than 1
        if (number > 1) {
            int greatestFactor = 1; // Variable to store the greatest factor
            
            // Loop from number - 1 down to 1 to find the largest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) { // Check if 'i' is a factor of 'number'
                    greatestFactor = i; // Assign 'i' to greatestFactor
                    break; // Exit loop after finding the largest factor
                }
            }
            
            // Print the greatest factor found
            System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        } else {
            // Display message for invalid input
            System.out.println("Please enter an integer greater than 1.");
        }
        
        scanner.close(); // Close the scanner
    }
}
