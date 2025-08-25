import java.util.Scanner;

// Program to calculate the number of rounds an athlete needs to complete 5 km run in a triangular park
public class AthleteRun {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user inputs for the sides of the triangular park
        System.out.print("Enter the first side of the park in meters: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the park in meters: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of the park in meters: ");
        double side3 = scanner.nextDouble();
        
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        
        // Convert 5 km to meters
        double totalDistance = 5000;
        
        // Calculate the number of rounds required
        double rounds = totalDistance / perimeter;
        
        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
