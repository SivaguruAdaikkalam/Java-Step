import java.util.Scanner;

public class ManualTrim {

    // Method to find start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String input) {
        int start = 0;
        int end = 0;
        int length = 0;

        // Calculate length without using length()
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // reached end
        }

        // Find first non-space character
        while (start < length && input.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        end = length - 1;
        while (end >= 0 && input.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt
    public static String customSubstring(String input, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += input.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        try {
            int len1 = 0, len2 = 0;

            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (Exception e) {}

        try {
            int len2 = 0;
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (Exception e) {}

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        // Trim manually
        int[] indexes = findTrimIndexes(input);
        String manualTrimmed = "";
        if (indexes[0] <= indexes[1]) {
            manualTrimmed = customSubstring(input, indexes[0], indexes[1]);
        }

        // Built-in trim
        String builtinTrimmed = input.trim();

        // Compare
        boolean isEqual = compareStrings(manualTrimmed, builtinTrimmed);

        // Output
        System.out.println("\nManually Trimmed String: '" + manualTrimmed + "'");
        System.out.println("Built-in Trimmed String: '" + builtinTrimmed + "'");
        System.out.println("Are both results same? " + isEqual);

        sc.close();
    }
}
