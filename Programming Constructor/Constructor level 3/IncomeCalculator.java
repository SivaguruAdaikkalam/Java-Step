import java.util.Scanner;

// Program to calculate total income by taking salary and bonus from user
public class IncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter salary
        System.out.print("Enter salary in INR: ");
        double salary = scanner.nextDouble();
        
        // Prompt the user to enter bonus
        System.out.print("Enter bonus in INR: ");
        double bonus = scanner.nextDouble();
        
        // Compute total income by adding salary and bonus
        double totalIncome = salary + bonus;
        
        // Display the total income
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
