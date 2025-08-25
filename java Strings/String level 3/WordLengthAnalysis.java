import java.util.Scanner;

public class WordLengthAnalysis {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached end
        }
        return count;
    }

    // Method to split a sentence into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;
        boolean inWord = false;

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
        if (word.length() > 0) {
            words[index] = word.toString();
        }

        return words;
    }

    // Method to convert words to a 2D array with word and its length
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordData) {
        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(wordData[0][1]);
        int maxLength = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int currentLength = Integer.parseInt(wordData[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex}; // indexes of shortest and longest
    }

    // Display the 2D word-length array
    public static void displayTable(String[][] wordData) {
        System.out.printf("%-15s | %s\n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] row : wordData) {
            System.out.printf("%-15s | %s\n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Process input
        String[] words = customSplit(input);
        String[][] wordWithLengths = getWordsWithLengths(words);
        int[] shortestAndLongest = findShortestAndLongest(wordWithLengths);

        // Display full table
        System.out.println("\nWord Length Table:");
        displayTable(wordWithLengths);

        // Display shortest and longest
        System.out.println("\nShortest word: " + wordWithLengths[shortestAndLongest[0]][0]);
        System.out.println("Longest word : " + wordWithLengths[shortestAndLongest[1]][0]);

        scanner.close();
    }
}
