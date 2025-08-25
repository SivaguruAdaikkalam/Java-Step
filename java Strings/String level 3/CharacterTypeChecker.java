import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to determine the type of character
    public static String getCharacterType(char ch) {
        // Convert to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // convert to lowercase
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze characters and return result in 2D array
    public static String[][] analyzeCharacters(String input) {
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // exit on exception
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharacterType(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s%-15s\n", "Character", "Type");
        System.out.println("-----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s%-15s\n", data[i][0], data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Analyze characters
        String[][] result = analyzeCharacters(input);

        // Display results
        displayResult(result);

        sc.close();
    }
}
