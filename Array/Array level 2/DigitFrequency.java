import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Handle negative number
        if (number < 0) {
            number = Math.abs(number);
        }

        // Step 2: Find count of digits and store them in an array
        int[] digits = new int[20]; // maximum 20 digits support
        int index = 0;
        long temp = number;

        while (temp > 0) {
            digits[index++] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 3: Create frequency array
        int[] frequency = new int[10];

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Step 4: Display digit frequencies
        System.out.println("\nDigit Frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " → " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
