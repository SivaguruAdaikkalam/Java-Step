import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature input
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        // Get wind speed input
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();

        // Check for valid wind speed (wind chill is valid only for windSpeed > 3 mph)
        if (windSpeed <= 3) {
            System.out.println("Wind speed too low for wind chill effect. Please enter a wind speed above 3 mph.");
        } else {
            // Calculate wind chill
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }
    }
}
