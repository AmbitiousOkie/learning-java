package mainPackage;

import java.io.IOException;
import java.util.Scanner;

public class LoadClasses {

    public static void main(String[] args) {
        
        // Initialize the classes
//        Message myMessage = new Message();
//        BasicIO myIO = new BasicIO();
//        GetSetCat gordon = new GetSetCat("Gordon",8);
//        TestErrors myErrors = new TestErrors();
//        ReadFile myFile = new ReadFile("/home/kris/learning-java/LearningJava/src/mainPackage/input.txt");
        IntroArrays myArray = new IntroArrays();
        
        // Test the classes in memory
//        myMessage.test();
//        myIO.test();
//        gordon.test();
//        myErrors.test();
//        myFile.test();
        myArray.test();
        
        System.out.println("Main loaded");
        
        // Run the classes
//        myFile.run();
//        myErrors.run();
          myArray.run();


//        gordon.test();
        
        

        
 
    }
    
}
