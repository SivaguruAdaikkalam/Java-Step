import java.util.Scanner;

public class DivisibleCalculator{
public static void main(String[]arg){
 Scanner scanner = new Scanner(System.in);

//taking input from user 
System.out.println("Enter a number: ");
double number = scanner.nextDouble();

//checking the number is divisible or not
if (number %5 == 0){
     System.out.println("Is the number " + number + "divisible  by 5? yes");
}
//if 5 is not  equal to zero then else part
else{
     System.out.println(" Is the number " + number + "divisible by 5? no"); 
}
// closer scanner
scanner.close();
}
}
   

