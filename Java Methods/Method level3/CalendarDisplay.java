import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    // Method to get number of days in a given month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    public static int getStartDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + months[month] + " " + year);
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(month, year);
        int numOfDays = getDaysInMonth(month, year);

        // First loop: print initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Second loop: print all days
        for (int day = 1; day <= numOfDays; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay) % 7 == 0 || day == numOfDays) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month input!");
        } else {
            displayCalendar(month, year);
        }

        sc.close();
    }
}
