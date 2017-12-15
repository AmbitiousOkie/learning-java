// Import the scanner package
import java.util.Scanner;

class Methods 
{
    // Method returns a double
    public static double cubeVolume(double sideLength)
    {
       double volume = sideLength * sideLength * sideLength;

       if (volume <= 0 )
       {
           return 0;
       } else
       {
        return volume;
       }
    }

    // Method with no return
    public static void hello(String name)
    {
        System.out.println("Hello, " + name);
    }

    public static void printTriangle(int sideLength)
    {
       if (sideLength < 1) { return; } 
       printTriangle(sideLength - 1);
       for (int i = 0; i < sideLength; i++)
       {
          System.out.print("[]");
       }
       System.out.println();
    
    }

    // Main method
    public static void main(String[] args)
    {
       // Creates a scanner called in 
       Scanner in = new Scanner(System.in);

       // Retrieve a name
       System.out.print("Please enter the first name: ");
       String firstName = in.next(); 

       // Retrieve an integer
       System.out.print("Please enter the length of one of the sides: ");
       int length = in.nextInt();

       hello(firstName);
       System.out.println("A cube with sides measuring " + length + " has a volume of " + cubeVolume(length) + ".");

       printTriangle(16);
    }
}

