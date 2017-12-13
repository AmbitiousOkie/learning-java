// Import the scanner package
import java.util.Scanner;

class BasicInputOutput {
    public static void main(String[] args) {
       // Creates a scanner called in 
       Scanner in = new Scanner(System.in);

       // Retrieve an integer
       System.out.print("Please enter the number of bottles: ");
       int bottles = in.nextInt();
       // Print a line with an unformatted variable
       System.out.println("Confirmed - Bottles: "+ bottles);


       // Retrieve a double
       System.out.print("Please enter the amount per bottle: ");
       double amount = in.nextDouble();
       // Print a formatted line conataining a double variable with only 2 decimals
       System.out.printf("Confirmed - Amount: $%.2f", amount);
       System.out.println();
       
       // Retrieve a string
       System.out.print("What's the customer's first name? ");
       String firstName = in.next();
       System.out.print("What's the customer's last name? ");
       String lastName = in.next();
       String name = firstName + " " + lastName;
       System.out.print("What's the customer number? ");
       String id = in.next();



       // Concatenate and escape a new line at the end
       String customer = "Customer: " + name + " - ID: " + id;
       System.out.println(customer);




       // Compute total
       double total = bottles * amount;
       // Save output to a string
       String output = String.format("%d bottles at a price of $%.2f comes out to:   $%.2f\n", bottles, amount, total) ;
       System.out.println(output);

       // Get the length of the output
       int lengthOfOutput = output.length();
       // Length and index are offset by 1. Output includes new line symbol. Trailing 6 is really (length - 8) to fit everything.
       String trailingSix = output.substring(lengthOfOutput - 8);
       System.out.println(trailingSix);



       



    }
 } 