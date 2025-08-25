import java.util.Scanner;

public class StringComparison {

    // Method to compare strings using charAt()
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

        // Taking input from the user
        System.out.print("Enter the first string: ");
        String string1 = scanner.next();

        System.out.print("Enter the second string: ");
        String string2 = scanner.next();

        // Comparing using custom method
        boolean charAtResult = compareUsingCharAt(string1, string2);

        // Comparing using built-in equals method
        boolean equalsResult = string1.equals(string2);

        // Displaying the results
        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Checking if both results are same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results are different.");
        }

        scanner.close();
    }
}
