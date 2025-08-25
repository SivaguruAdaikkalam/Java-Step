import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (greater than 0). Exiting...");
            return;
        }
        
        int evenSize = number / 2 + 1;
        int oddSize = number / 2 + 1;
        int[] evenNumbers = new int[evenSize];
        int[] oddNumbers = new int[oddSize];
        
        int evenIndex = 0, oddIndex = 0;
        
        System.out.println("Processing numbers...");
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println("Adding " + i + " to even numbers array");
                evenNumbers[evenIndex++] = i;
            } else {
                System.out.println("Adding " + i + " to odd numbers array");
                oddNumbers[oddIndex++] = i;
            }
        }
        
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        
        System.out.println("Processing complete.");
        
        scanner.close();
    }
}
