import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false"; // invalid age
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display result in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("----\t---------");
        for (String[] row : data) {
            int age = Integer.parseInt(row[0]);
            boolean canVote = Boolean.parseBoolean(row[1]);
            System.out.println(age + "\t" + canVote);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students (e.g. 10): ");
        int n = sc.nextInt();

        // Generate random ages
        int[] studentAges = generateRandomAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(studentAges);

        // Display results
        displayTable(result);

        sc.close();
    }
}
