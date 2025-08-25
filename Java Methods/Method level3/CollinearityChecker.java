import java.util.Scanner;

public class CollinearityChecker {

    // Method using slope comparison
    public static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method using area of triangle
    public static boolean isCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 3 points
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check using slope
        boolean collinearBySlope = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Formula: " + collinearBySlope);

        // Check using area
        boolean collinearByArea = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Area Formula: " + collinearByArea);

        // Final output
        if (collinearBySlope && collinearByArea) {
            System.out.println("✅ The points are Collinear.");
        } else {
            System.out.println("❌ The points are NOT Collinear.");
        }

        sc.close();
    }
}
