import java.util.Scanner;

public class NaturalNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is a natural number (positive integer)
        if (number >= 1) {
            int sum = number * (number + 1) / 2; // Sum of first n natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        scanner.close();
    }
}
