/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.BloodBank.BloodBankDirectory;
import Business.Role.BloodBankManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class BloodBankOrganization extends Organizations{
    private BloodBankDirectory bloodBankDirectory;

    public BloodBankDirectory getBloodBankDirectory() {
        return bloodBankDirectory;
    }

    public void setBloodBankDirectory(BloodBankDirectory bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }
    
    public BloodBankOrganization(){
        super(Organizations.Type.BloodBank.getValue());
        bloodBankDirectory = new BloodBankDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankManagerRole());
        return roles;
    }
}
