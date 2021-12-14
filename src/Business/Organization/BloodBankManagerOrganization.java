/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.BloodBank.BloodBankManagerDirectory;
import Business.Role.BloodBankManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class BloodBankManagerOrganization extends Organizations {

    private BloodBankManagerDirectory bloodBankManagerDirectory;

    public BloodBankManagerDirectory getBloodBankManagerDirectory() {
        return bloodBankManagerDirectory;
    }

    public void setBloodBankManagerDirectory(BloodBankManagerDirectory bloodBankManagerDirectory) {
        this.bloodBankManagerDirectory = bloodBankManagerDirectory;
    }

 
    public BloodBankManagerOrganization() {
        super(Organizations.Type.BloodBankManager.getValue());
        bloodBankManagerDirectory = new BloodBankManagerDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankManagerRole());
        return roles;
    }
}
