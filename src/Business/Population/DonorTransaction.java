/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import Business.BloodBank.BloodBank;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodBankOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organizations;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author neeraja
 */

public class DonorTransaction {
    private float hblevel;
    private Date bloodLastDonatedDate;
    private Date BloodDonationDate;
    private int numberOfUnits;
    private boolean otherDiseases;
    private boolean isEligible;
    private float price;
    private float weight;
    private float height;
    private int age;
    
    BloodBank bloodbank;

    public BloodBank getBloodbank() {
        return bloodbank;
    }
    public void setBloodBankByID(String name){
         ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise = enterpriseList.stream().filter(item -> "BloodBank".equals(item.getName())).findFirst().orElse(null);
        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("BloodBank Organization")) {
                BloodBankOrganization hsoOrg = (BloodBankOrganization) o;
                this.bloodbank = hsoOrg.getBloodBankDirectory().getBloodBankList().stream().filter(item -> name.equals(item.getName())).findFirst().orElse(null);
                break;
            }
        }
    }

    public void setBloodbank(BloodBank bloodbank) {
        this.bloodbank = bloodbank;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHblevel() {
        return hblevel;
    }

    public void setHblevel(float hblevel) {
        this.hblevel = hblevel;
    }

    public Date getBloodLastDonatedDate() {
        return bloodLastDonatedDate;
    }

    public void setBloodLastDonatedDate(Date bloodLastDonatedDate) {
        this.bloodLastDonatedDate = bloodLastDonatedDate;
    }

    public Date getBloodDonationDate() {
        return BloodDonationDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBloodDonationDate(Date BloodDonationDate) {
        this.BloodDonationDate = BloodDonationDate;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public boolean isOtherDiseases() {
        return otherDiseases;
    }

    public void setOtherDiseases(boolean otherDiseases) {
        this.otherDiseases = otherDiseases;
    }

    public boolean isIsEligible() {
        return isEligible;
    }

    public void setIsEligible(boolean isEligible) {
        this.isEligible = isEligible;
    }

    public DonorTransaction() {
    }

    @Override
    public String toString() {
        return "DonorTransaction{" + "hblevel=" + hblevel +"age=" + age +"height=" + height +"weight=" + weight + ", bloodLastDonatedDate=" + bloodLastDonatedDate + ", BloodDonationDate=" + BloodDonationDate + ", numberOfUnits=" + numberOfUnits + ", otherDiseases=" + otherDiseases + ", isEligible=" + isEligible + '}';
    }
    
    
}
