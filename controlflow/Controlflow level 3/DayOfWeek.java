public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse command-line arguments
        int m = Integer.parseInt(args[0]); // Month (1-12)
        int d = Integer.parseInt(args[1]); // Day (1-31)
        int y = Integer.parseInt(args[2]); // Year

        // Apply formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println("Day of the week: " + d0);
    }
}
