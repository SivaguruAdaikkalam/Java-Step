import java.util.Scanner;

public class StudentScoreCard {

    // Generate random 2-digit scores for PCM
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // PCM
        for (int i = 0; i < n; i++) {
            scores[i][0] = 50 + (int)(Math.random() * 50); // Physics
            scores[i][1] = 50 + (int)(Math.random() * 50); // Chemistry
            scores[i][2] = 50 + (int)(Math.random() * 50); // Math
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    // Calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percent = stats[i][2];
            if (percent >= 90)
                grades[i] = "A+";
            else if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    }

    // Display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("S.No\tPhysics\tChem\tMaths\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                    (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t" +
                    grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);

        sc.close();
    }
}
