import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the string: ");
        String originalString = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Create substring using charAt()
        String subCharAt = substringUsingCharAt(originalString, start, end);

        // Create substring using built-in substring()
        String subBuiltIn = originalString.substring(start, end);

        // Compare both substrings
        boolean isEqual = compareUsingCharAt(subCharAt, subBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using built-in substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);

        scanner.close();
    }
}
