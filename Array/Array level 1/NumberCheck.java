import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        final int size = 5;
        int[] numbers = new int[size];
        Scanner scanner = new Scanner(System.in);

        // Taking input for numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking numbers
        System.out.println("\nNumber Classification:");
        for (int i = 0; i < size; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing first and last element
        System.out.println("\nComparison of First and Last Elements:");
        if (numbers[0] > numbers[size - 1]) {
            System.out.println("The first number " + numbers[0] + " is greater than the last number " + numbers[size - 1] + ".");
        } else if (numbers[0] < numbers[size - 1]) {
            System.out.println("The first number " + numbers[0] + " is less than the last number " + numbers[size - 1] + ".");
        } else {
            System.out.println("The first number and the last number are equal.");
        }
        scanner.close();
    }
}
