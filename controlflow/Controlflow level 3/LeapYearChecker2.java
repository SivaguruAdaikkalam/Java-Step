import java.util.Scanner;

public class LeapYearChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is within the valid range
        if (year >= 1582) {
            // Single if condition using logical AND (&&) and OR (||)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("The Leap Year check is only valid for years from 1582 onwards.");
        }

        scanner.close();
    }
}
