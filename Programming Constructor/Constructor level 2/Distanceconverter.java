import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Converting to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Converting height to cm, feet, and inches
        double heightInCm = distanceInFeet * 30.48;
        double heightInFeet = distanceInFeet;
        double heightInInches = distanceInFeet * 12;

        // Displaying the results
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);

        scanner.close();
    }
}
