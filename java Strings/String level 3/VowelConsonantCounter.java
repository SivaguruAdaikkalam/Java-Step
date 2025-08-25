import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check the type of character
    public static String checkCharacterType(char ch) {
        // Convert to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String type = checkCharacterType(ch);

                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }
            } catch (IndexOutOfBoundsException e) {
                break; // End of string
            }
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsAndConsonants(input);

        // Display result
        System.out.println("Number of Vowels    : " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        scanner.close();
    }
}
