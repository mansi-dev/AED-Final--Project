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
public class Receiver extends User {
    private String bloodGroup;
    private float hblevel;
    
     public Receiver() {
    }
     public Receiver(String bloodGroup, float hblevel) {
        this.bloodGroup = bloodGroup;
        this.hblevel = hblevel;
        
    }
     
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    public float getHblevel() {
        return hblevel;
    }

    public void setHblevel(float hblevel) {
        this.hblevel = hblevel;
    
    }

    @Override
    public String toString() {
        return "Receiver{" + "bloodGroup=" + bloodGroup + ", hblevel=" + hblevel + '}';
    }
    
    
}
