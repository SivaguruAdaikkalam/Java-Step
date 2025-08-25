import java.util.Scanner;

// Program to calculate Simple Interest
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        
        // Get user input for Rate of Interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();
        
        // Get user input for Time period
        System.out.print("Enter the Time period (in years): ");
        double time = scanner.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the results
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
