package mainPackage;

import java.io.IOException;
import java.util.Scanner;

public class LoadClasses {

    public static void main(String[] args) throws IOException {
        
        Message myMessage = new Message();
        BasicIO myIO = new BasicIO();
        GetSetCat gordon = new GetSetCat("Gordon",8);
        
        // Test the classes in memory
        myIO.test();
        myMessage.test();
        System.out.println("Main loaded");
//        gordon.test();
        
        
//        Read a file
        String file_name = "/home/kris/learning-java/LearningJava/src/mainPackage/input.txt";
        
        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            
            file.processFile(aryLines);
            
        }
        catch (IOException e) {
            System.out.println( e.getMessage() );
        }
        
 
    }
    
}
