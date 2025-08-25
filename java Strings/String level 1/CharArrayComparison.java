import java.util.Scanner;

public class CharArrayComparison {

    // Method to return character array using charAt()
    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get char arrays using both methods
        char[] customChars = getCharsUsingCharAt(input);
        char[] builtInChars = input.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(customChars, builtInChars);

        // Display results
        System.out.print("Characters using custom method: ");
        for (char c : customChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + areEqual);

        scanner.close();
    }
}
