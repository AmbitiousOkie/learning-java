/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

// Import the scanner package
import java.util.Scanner;

/**
 *
 * @author kris
 */
public class Message
{
    // Creates a scanner called in 
    Scanner in = new Scanner(System.in);
    
    // Message attribute
    String input;
    
    public void test()
    {
        System.out.println("Message loaded");
    }
    
    
    // Sets the message attribute
    public void setMessage()
    {
        System.out.print("Enter a message: ");
        this.input = in.nextLine();
    }
    
    // Returns the message attribute
    public String getMessage()
    {
        return this.input;
    }
    
    // Prints the message attribute
    public void printMessage()
    {
        System.out.println("Message: " + this.input);
    }
    
    
    
    
}
