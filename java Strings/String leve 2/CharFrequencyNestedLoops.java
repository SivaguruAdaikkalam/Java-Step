import java.util.Scanner;

public class CharFrequencyNestedLoops {

    // Method to find character frequencies using nested loops
    public static String[] findCharFrequencies(String text) {
        char[] chars = text.toCharArray(); // convert to char array
        int[] freq = new int[chars.length];

        // Count frequency using nested loops
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;

            if (chars[i] == '0') {
                continue; // already counted
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Count valid entries
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create 1D String array to hold results
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = "'" + chars[i] + "' : " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = findCharFrequencies(input);

        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
