import java.util.Scanner;

public class GeometryCalculator {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate the equation of a line and return slope and y-intercept
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        
        if (x1 == x2) {
            // Handle vertical line separately
            System.out.println("This is a vertical line. Equation: x = " + x1);
            result[0] = Double.POSITIVE_INFINITY; // Infinite slope
            result[1] = Double.NaN;               // No y-intercept
            return result;
        }

        double m = (y2 - y1) / (x2 - x1);         // slope
        double b = y1 - m * x1;                   // y-intercept
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs for points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Distance calculation
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f\n", distance);

        // Line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        if (lineEquation[0] != Double.POSITIVE_INFINITY) {
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
        }

        sc.close();
    }
}
