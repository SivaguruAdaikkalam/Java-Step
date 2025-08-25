import java.util.Scanner;

public class DigitAnalyzerDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 2: Extract digits and store in array with dynamic resizing
        while (number != 0) {
            // Resize logic
            if (index == maxDigit) {
                maxDigit += 10; // Increase size by 10
                int[] temp = new int[maxDigit];

                // Copy old digits into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // Assign the new expanded array
            }

            int digit = number % 10;
            digits[index] = digit;
            index++;
            number = number / 10;
        }

        // Step 3: Find largest and second largest
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

        // Step 4: Output
        System.out.println("\n--- Results ---");
        System.out.print("Digits entered: ");
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
