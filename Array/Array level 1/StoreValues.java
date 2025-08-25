import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store up to 10 numbers
        double total = 0.0; // Variable to store the sum of numbers
        int index = 0; // Index for array

        System.out.println("Enter numbers (0 or negative number to stop, max 10 numbers):");

        while (true) {
            if (index == 10) { // Stop if array is full
                break;
            }
            
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            
            if (num <= 0) { // Stop if user enters 0 or negative number
                break;
            }
            
            numbers[index] = num; // Store number in array
            index++; // Increment index
        }
        
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i]; // Calculate total sum
        }
        
        System.out.println("\nTotal sum: " + total);
        scanner.close();
    }
}