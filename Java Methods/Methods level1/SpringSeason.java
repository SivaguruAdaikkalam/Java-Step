import java.util.Scanner;

public class SpringSeason {

    // Method to check whether the date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get month and day input from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        // Call the method and display result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        scanner.close();
    }
}
