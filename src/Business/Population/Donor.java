/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import Business.UserAccount.User;

/**
 *
 * @author neeraja
 */
public class Donor extends User{
    private int age;
    private float weight;
    private float height;
     private String bloodGroup;

   
   

    @Override
    public String toString() {
        return "Donor{" + "age=" + age + ", weight=" + weight + ", height=" + height + ", bloodGroup=" + bloodGroup +'}';
    }

    public Donor() {
    }

    public Donor(int age, float weight, float height, String bloodGroup) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bloodGroup = bloodGroup;
        
    }
     public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    
}
