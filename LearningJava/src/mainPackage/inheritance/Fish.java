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
public class Fish extends Animal{
    private String noise = "fins";
    private String species;
    
    public void Fish(String a){
        species = a;
    };
    
    public void move(){
        System.out.println("I swam.");
    }
    
    public void run(){
        this.speak(noise);
        this.move();
    }
    
    
    
}
