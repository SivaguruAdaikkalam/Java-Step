import java.util.Scanner;

public class SplitStringWithoutSplitMethod {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split the string into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;

        // Count number of words
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

        // Store indexes of space and boundaries
        int[] spaceIndexes = new int[wordCount + 1]; // store start indexes
        int index = 0;
        boolean isNewWord = true;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && isNewWord) {
                spaceIndexes[index++] = i;
                isNewWord = false;
            } else if (text.charAt(i) == ' ') {
                isNewWord = true;
            }
        }
        spaceIndexes[wordCount] = length; // end boundary

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i];
            int end = (i == wordCount - 1) ? length : spaceIndexes[i + 1];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end && text.charAt(j) != ' '; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Built-in split
        String[] builtInWords = input.split(" ");

        // Custom split
        String[] customWords = customSplit(input);

        // Compare
        boolean isSame = compareStringArrays(builtInWords, customWords);

        // Display result
        System.out.println("\nCustom Split Words:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Words:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both word arrays equal? " + isSame);

        scanner.close();
    }
}
