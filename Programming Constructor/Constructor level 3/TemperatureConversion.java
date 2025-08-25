import java.util.Scanner;

// Program to convert temperature from Celsius to Fahrenheit
public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        
        // Read the user input as a double value
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9/5) + 32;
        
        // Display the converted temperature
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
