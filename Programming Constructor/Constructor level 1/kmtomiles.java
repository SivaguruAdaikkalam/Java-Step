import java.util.Scanner; // Import Scanner class for user input

class KilometerToMileConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km;
        
       
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble(); // Read user input
        
      
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
