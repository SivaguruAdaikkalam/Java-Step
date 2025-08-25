import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

        scanner.close();
    }
}
