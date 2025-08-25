import java.util.Scanner;

public class TrigonometryCalculator {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians
        double[] result = new double[3];
        result[0] = Math.sin(radians);   // Sine
        result[1] = Math.cos(radians);   // Cosine
        result[2] = Math.tan(radians);   // Tangent
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Print results
        System.out.printf("Sine of %.2f° = %.4f\n", angle, trigValues[0]);
        System.out.printf("Cosine of %.2f° = %.4f\n", angle, trigValues[1]);
        System.out.printf("Tangent of %.2f° = %.4f\n", angle, trigValues[2]);
    }
}
