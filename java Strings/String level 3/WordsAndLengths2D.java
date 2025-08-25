import java.util.Scanner;

public class WordsAndLengths2D {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to split the string into words using charAt()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;
        boolean inWord = false;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        StringBuilder word = new StringBuilder();
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            }
        }
        // Add last word if any
        if (word.length() > 0) {
            words[index] = word.toString();
        }

        return words;
    }

    // Method to return a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to display 2D array in a tabular format
    public static void displayWordTable(String[][] wordData) {
        System.out.printf("%-15s | %s\n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] row : wordData) {
            System.out.printf("%-15s | %d\n", row[0], Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Process
        String[] words = customSplit(input);
        String[][] wordWithLengths = getWordsWithLengths(words);

        // Display
        System.out.println("\nWord Length Table:");
        displayWordTable(wordWithLengths);

        scanner.close();
    }
}
