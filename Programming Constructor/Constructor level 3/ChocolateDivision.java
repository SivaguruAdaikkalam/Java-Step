import java.util.Scanner;

// Program to divide chocolates among children
public class ChocolateDivision {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        // Get user input for the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        // Calculate chocolates each child gets and the remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
