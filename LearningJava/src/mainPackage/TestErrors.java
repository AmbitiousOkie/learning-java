/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author kris
 */
public class TestErrors {
    
    public void test(){
        System.out.println("TestErrors loaded");
    }
    
    public void run(){
        try {
            this.makeError();
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("You think you're funny....!");
        }
        finally {
            System.out.println("Got past the error!");
        }
    }
    
    public void makeError() throws IOException{
        Scanner in = new Scanner(System.in);

        String choice;
        
        System.out.println("What kind of error do you want?");
        System.out.println(" [0] Quit");
        System.out.println(" [1] IOException - Checked");
        
        
        choice = in.next();
        int errorType = Integer.parseInt(choice);
        
        switch(errorType) {
            case 0:         return;
            case 1:         throw new IOException("End of file expected");
            
        }
    }
    
}
