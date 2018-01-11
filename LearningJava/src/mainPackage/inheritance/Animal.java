/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage.inheritance;

/**
 *
 * @author kris
 */
public class Animal {
    
    public void speak(String sound) {
        System.out.println("I have " + sound);
    }
    
    public void test(String animal) {
        System.out.println(animal + " running");
    }
    
    public void move(){
        System.out.println("I moved as a generic animal.");
    }
    
}
