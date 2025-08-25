import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for countdown start
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        System.out.println("Liftoff! ");
        scanner.close();
    }
}
