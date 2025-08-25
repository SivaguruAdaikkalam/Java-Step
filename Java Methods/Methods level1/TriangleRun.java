import java.util.Scanner;

public class TriangleRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000.0; // 5 km in meters
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display the result rounded up to 2 decimal places
        System.out.printf("The athlete must complete %.2f rounds to run 5 kilometers.\n", rounds);

        scanner.close();
    }
}
