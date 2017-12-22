/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

/**
 *
 * @author kris
 */
public class GetSetCat {
    
    private String name;
    private double weight;
    
    public GetSetCat(String name, double weight){
        this.setName(name);
        this.setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void test(){
        System.out.println("GetSetCat loaded\n  Cat: " + this.name + "\n  Weight: " + weight);
    }
    
    
}
