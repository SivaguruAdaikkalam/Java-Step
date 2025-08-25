import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        // Calculating area in square inches
        double areaInInches = 0.5 * base * height;

        // Converting area to square centimeters (1 square inch = 6.4516 square cm)
        double areaInCm = areaInInches * 6.4516;

        // Converting height to cm, feet, and inches
        double heightInCm = height * 2.54;
        double heightInFeet = height / 12;
        double heightInInches = height;

        // Displaying the results
        System.out.println("The area of the triangle is " + areaInInches + " square inches or " + areaInCm + " square centimeters.");
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);

        scanner.close();
    }
}
