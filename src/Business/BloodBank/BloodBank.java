/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodBank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class BloodBank {
    private long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private long phoneNum;
    private String email;
    
    private List<BloodStock> bloodStock = new ArrayList();

    BloodBank() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BloodStock> getBloodStock() {
        return bloodStock;
    }

    public void setBloodStock(List<BloodStock> bloodStock) {
        this.bloodStock = bloodStock;
    }

    public BloodBank(long id, String name, String address, String city, String state, String zipCode, long phoneNum, String email, List<BloodStock> bloodStock) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNum = phoneNum;
        this.email = email;
        this.bloodStock = bloodStock;
    }

    @Override
    public String toString() {
        return "BloodBank{" + "id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNum=" + phoneNum + ", email=" + email + ", bloodStock=" + bloodStock + '}';
    }
    
    
}
