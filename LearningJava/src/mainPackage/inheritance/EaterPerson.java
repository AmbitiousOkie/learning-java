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
public class EaterPerson {
    public void createFood() {
        Food[] eater = new Food[2];
        eater[0] = new Chili("Spicy");
        eater[1] = new GrossFood();
        
        for(int i = 0; i < eater.length; i++) {
            eater[i].eat();
        }
        
    }
    
    public void run(){
        createFood();
    }
    
}
