import java.util.Scanner;

// Program to swap two numbers
public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter first number
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        // Prompt the user to enter second number
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Display the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
