import java.util.Scanner;

public class MaximumHandshakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + handshakes);
        
        scanner.close();
    }
}
