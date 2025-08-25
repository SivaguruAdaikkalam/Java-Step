import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 2: Create arrays
        int[][] marks = new int[numStudents][3]; // [student][subject]
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Step 3: Input marks with validation
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            boolean valid = true;

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks for " + subject + ": ");
                int mark = scanner.nextInt();

                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter all marks for this student.");
                    valid = false;
                    break; // Break inner loop and repeat this student
                } else {
                    marks[i][j] = mark;
                }
            }

            if (!valid) {
                i--; // Repeat this student
            }
        }

        // Step 4: Calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Step 5: Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
