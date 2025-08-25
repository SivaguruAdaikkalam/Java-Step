import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 1: Take input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Extract digits and store in array
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            number = number / 10;

            if (index == maxDigit) {
                break;
            }
        }

        // Step 3: Find largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 4: Display results
        System.out.println("\n--- Results ---");
        System.out.println("Digits entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);

        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (all digits are same)");
        }

        scanner.close();
    }
}
