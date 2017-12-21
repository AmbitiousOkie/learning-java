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
    
    public void test() {
        System.out.println("FileData loaded");
    }
    
    private String inputFileName;
    
    public ReadFile(String file_path) {
        inputFileName = file_path;
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
            System.out.println("-- Line " + i + " -- " + input[i]);
            System.out.println("How would you like to process the line?");
            System.out.println("[1] Read character");
            String choice = in.next();
        }
    }
}
