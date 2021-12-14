/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodBank;

/**
 *
 * @author mansizope
 */
public class BloodStock {
    private long id;
    private String bloodGroup;
    private int quantity=0;
    private static int counter=0;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BloodStock(String bloodGroup, int quantity) {
        this.id = ++counter;
        this.bloodGroup = bloodGroup;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BloodStock{" + "id=" + id +  ", bloodGroup=" + bloodGroup + ", quantity=" + quantity + '}';
    }
    
    
}
