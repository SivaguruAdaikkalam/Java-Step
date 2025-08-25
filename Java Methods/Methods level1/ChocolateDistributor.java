import java.util.Scanner;

public class ChocolateDistributor {

    // Method to find how many chocolates each child gets and the remaining
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Chocolates per child (Quotient)
        result[1] = number % divisor;  // Remaining chocolates (Remainder)
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Get number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children!");
        } else {
            // Call method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Print result
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
