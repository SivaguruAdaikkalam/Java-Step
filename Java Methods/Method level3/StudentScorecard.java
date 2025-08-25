import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit PCM scores for each student
    public static int[][] generateScores(int studentCount) {
        Random rand = new Random();
        int[][] scores = new int[studentCount][3]; // Physics, Chemistry, Math

        for (int i = 0; i < studentCount; i++) {
            scores[i][0] = 50 + rand.nextInt(51);  // Physics: 50–100
            scores[i][1] = 50 + rand.nextInt(51);  // Chemistry
            scores[i][2] = 50 + rand.nextInt(51);  // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScoreStats(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // [Total, Average, Percentage]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    stats[i][0],
                    stats[i][1],
                    stats[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentCount = sc.nextInt();

        int[][] pcmScores = generateScores(studentCount);
        double[][] stats = calculateScoreStats(pcmScores);
        displayScorecard(pcmScores, stats);
    }
}
