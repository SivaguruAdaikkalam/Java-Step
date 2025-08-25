import java.util.Arrays;

public class NumberChecker3 {

    // Method to count the number of digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to convert number to digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Method to check if number is palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check for Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {  // Skip index 0 to avoid leading zero
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed digits array: ");
        for (int r : reversed) System.out.print(r + " ");
        System.out.println();

        System.out.println("Are original and reversed arrays equal? " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome Number? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}
