import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is within the valid range
        if (year < 1582) {
            System.out.println("The Leap Year check is only valid for years from 1582 onwards.");
        } else {
            // Approach 1: Using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            // Approach 2: Using a single if statement with multiple logical conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("(Logical Check) " + year + " is a Leap Year.");
            } else {
                System.out.println("(Logical Check) " + year + " is NOT a Leap Year.");
            }
        }
        
        scanner.close();
    }
}

