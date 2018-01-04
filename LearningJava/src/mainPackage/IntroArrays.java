
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.util.*;
/**
 *
 * @author kris
 */
public class IntroArrays {
    
      
    List<Integer> intArray = new ArrayList<Integer>();
    
    public void fillArray(Integer num){
        for (Integer i = 0; i < num; i ++) {
            intArray.add(i);
        }
    }

    public void printArray(List<Integer> passedArray){
        for (int number : passedArray){
            System.out.println(number);
        }
//        System.out.printf("%d, ", intArray);
    }
    

    


    
    public void run() {
        fillArray(20);
        printArray(intArray);
    }
    
    public void test() {
        System.out.println("IntroArrays loaded");
    }
}
