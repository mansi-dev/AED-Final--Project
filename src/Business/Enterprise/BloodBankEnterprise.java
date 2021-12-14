/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.BloodBank.BloodBankDirectory;
import Business.Role.BloodBankManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class BloodBankEnterprise extends Enterprise {
    

    
    public BloodBankEnterprise(String name){
        super(name,EnterpriseType.BloodBank);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankManagerRole());
        return roles;
    }

    
}
