/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;


/**
 *
 * @author kris
 */
public class ReadFile {
    
    public void run() {
        //        Read a file
//        String file_name = "/home/kris/learning-java/LearningJava/src/mainPackage/input.txt";
        
        try {
            ReadFile file = new ReadFile(this.inputFileName);
            String[] aryLines = file.OpenFile();
            
            file.processFile(aryLines);
            
        }
        catch (IOException e) {
            System.out.println( e.getMessage() );
        }
        catch (NumberFormatException e) {
            System.out.println("Bad input! " + e.getMessage() );
            
        }
    }
    
    public void test() {
        System.out.println("FileData loaded");
    }
    
    private String inputFileName;
    
    public ReadFile(String file_path) {
        this.inputFileName = file_path;
    }
    
       
    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(inputFileName);
        BufferedReader textReader = new BufferedReader(fr);
        
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];
        
        int i;

        for (i=0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        return textData;
    }
    
    int readLines() throws IOException {
        
        FileReader file_to_read = new FileReader(inputFileName);
        BufferedReader bf = new BufferedReader(file_to_read);
        
        String aLine;
        int numberOfLines = 0;
        
        while ((aLine = bf.readLine()) != null) {
            numberOfLines++;
        }
        
        bf.close();
        
        return numberOfLines;
    }
    
    public void processFile(String[] input) throws IOException {
        
        Scanner in = new Scanner(System.in);
        
        int i;
        for(i=0; i < input.length; i++) {
            String choice1, choice2, line = "Line " + i + ": ";
            int choice1Num, choice2Num;
            System.out.println();
            System.out.printf("%-12s%20s\n", line, input[i]);
            
            System.out.println("How would you like to process the line?");
            System.out.println("[0] Quit");
            System.out.println("[1] Read character");
            System.out.println("[2] Classify character");
            System.out.println();
            choice1 = in.next();
            choice1Num = Integer.parseInt(choice1);
//            System.out.println("Test");
            if (choice1Num == 1) {
                System.out.println("Which character position?");
                choice2 = in.next();
                choice2Num = Integer.parseInt(choice2);
                System.out.printf("Char: %s%5s\n", choice2Num, input[i].charAt(choice2Num));
//                System.out.println(input[i].charAt(choice2Num));
                System.out.println();
                System.out.println();
            } if (choice1Num == 2){
                System.out.println("Which character position?");
                choice2 = in.next();
                choice2Num = Integer.parseInt(choice2);
                char character = input[i].charAt(choice2Num);
                if (Character.isDigit(character)) {
                    System.out.println("Is a digit.");
                } else {
                    System.out.println("Is a character.");
                }
            } else if (choice1Num == 0) {
                // Quit
                System.out.println("Quitting.");
                return;
            }
            
        }
    }
}
