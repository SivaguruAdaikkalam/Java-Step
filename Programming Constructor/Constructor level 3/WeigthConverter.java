import java.util.Scanner;

// Program to convert weight from pounds to kilograms
public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        
        // Convert weight to kilograms (1 pound = 2.2 kg)
        double weightInKg = weightInPounds / 2.2;
        
        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
