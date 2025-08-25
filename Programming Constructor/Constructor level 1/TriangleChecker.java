import java.util.Scanner;

class TriangleCheaker {
public static void main (String[] args){

    //creating the Scanner object
Scanner input = new Scanner(System.in){
    //get input from user
int x = input.nextInt();
int y = input.nextInt();
int z = input.nextInt();

    //Find the sum of angles
int SumOfAngles = x + y + z ;

    //check if sum is equal yo 180 or  not
System.out.println("the given angles " + x + "," + y + "," + z + "add to " + SumOfAngles);

if(SumOfAngles == 180)
{
 System.out.println("The given angles are internal angles of a" + " triangles" )
}
else{
System.out.println("The given angles are not internal angles of a" + " triangles" )
}
input.close();
}
}

