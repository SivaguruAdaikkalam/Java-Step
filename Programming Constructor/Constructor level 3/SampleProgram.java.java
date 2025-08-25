import java.util.Scanner;

// Program to take user inputs and perform integer operations
public class SampleProgram2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user inputs for travel details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter your final destination city: ");
        String toCity = scanner.nextLine();
        
        // Take user inputs for distances
        System.out.print("Enter distance from start city to via city (in miles): ");
        int fromToVia = scanner.nextInt();
        
        System.out.print("Enter distance from via city to final city (in miles): ");
        int viaToFinalCity = scanner.nextInt();
        
        // Take user inputs for time taken
        System.out.print("Enter time taken for travel (in hours): ");
        int timeTaken = scanner.nextInt();
        
        // Take user inputs for fee and discount percentage
        System.out.print("Enter fee amount: ");
        int fee = scanner.nextInt();
        
        System.out.print("Enter discount percentage: ");
        int discountPercent = scanner.nextInt();
        
        // Perform integer operations
        int totalDistance = fromToVia + viaToFinalCity;
        int discountAmount = (fee * discountPercent) / 100;
        int finalFee = fee - discountAmount;
        
        // Display the results
        System.out.println("The results of Int Operations are " + totalDistance + ", " + discountAmount + ", and " + finalFee);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
