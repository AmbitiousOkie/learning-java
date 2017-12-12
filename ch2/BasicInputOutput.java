import java.util.Scanner;

class BasicInputOutput {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.print("Please enter the number of bottles: ");
       int bottles = in.nextInt();

       System.out.println("That's a total of: "+ bottles + " bottles!");
    }
 } 