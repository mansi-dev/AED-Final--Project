/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Organization.BloodBankOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organizations;
import java.util.ArrayList;

/**
 *
 * @author neeraja
 */
public class ReceiverTransaction {
    private int numberOfUnits;
    private Hospital hospital;
    private float price;
    private float hblevel;
    private float weight;
    private float height;
    private int age;

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

    public ReceiverTransaction() {
    }

    public ReceiverTransaction(float hblevel,int numberOfUnits, Hospital hospital) {
        this.numberOfUnits = numberOfUnits;
        this.hospital = hospital;
        this.hblevel = hblevel;
    }
    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getHblevel() {
        return hblevel;
    }

    public void setHblevel(float hblevel) {
        this.hblevel = hblevel;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setHospitalByID(String name){
         ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);
        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("Hospital Organization")) {
                HospitalOrganization hsoOrg = (HospitalOrganization) o;
                this.hospital = hsoOrg.getHospitalDirectory().getHospitalList().stream().filter(item -> name.equals(item.getName())).findFirst().orElse(null);
                break;
            }
        }
    }
}
