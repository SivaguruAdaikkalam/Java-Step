import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        int[] table = new int[10];

        // Storing multiplication results
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Displaying multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        scanner.close();
    }
}
