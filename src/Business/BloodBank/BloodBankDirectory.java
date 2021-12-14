/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodBank;

import Business.Hospital.Hospital;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class BloodBankDirectory {
    private List<BloodBank> bloodBankList=new ArrayList<>();

    public BloodBankDirectory() {
    }

    public List<BloodBank> getBloodBankList() {
        return bloodBankList;
    }

    public void setBloodBankList(List<BloodBank> bloodBankList) {
        this.bloodBankList = bloodBankList;
    }

    public BloodBankDirectory(List<BloodBank> bloodBankList) {
        this.bloodBankList = bloodBankList;
    }
    
     public BloodBank addNewBloodBank(){
        BloodBank bloodBank = new BloodBank();
        this.bloodBankList.add(bloodBank);
        return bloodBank;
    }
    
    public void deleteHospital(BloodBank bloodBank){
        this.bloodBankList.remove(bloodBank);
    }
    
    public BloodBank getBloodBankByID(int id){        
        for(BloodBank r : this.bloodBankList){            
            if(r.getId()==id) return r;
        }
        return null;
    }
    
    
}
