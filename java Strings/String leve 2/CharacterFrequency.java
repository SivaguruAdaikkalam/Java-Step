import java.util.Scanner;

public class CharacterFrCharacterFrequencyequency {

    // Method to get frequency of characters and return a 2D array
    public static Object[][] getCharacterFrequencies(String text) {
        int[] freq = new int[256]; // Array to hold frequencies

        // Step 1: Count frequency of each character
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        // Step 2: Store characters and their frequencies in a 2D array
        Object[][] result = new Object[256][2];
        int index = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (!visited[ch]) {
                    visited[ch] = true;
                    result[index][0] = ch;
                    result[index][1] = freq[ch];
                    index++;
                }
            } catch (Exception e) {
                break;
            }
        }

        // Step 3: Create a trimmed array to remove unused rows
        Object[][] finalResult = new Object[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Object[][] frequencies = getCharacterFrequencies(input);

        System.out.println("Character Frequencies:");
        for (Object[] row : frequencies) {
            System.out.println("'" + row[0] + "' : " + row[1]);
        }

        scanner.close();
    }
}
