/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class BloodBankManagerDirectory {
    private List<BloodBankManager> adminList = new ArrayList();
    
    public List<BloodBankManager> getAdminList(){
        return this.adminList;
    }
    
    public BloodBankManager createAdmin(int id){
        BloodBankManager temp = new BloodBankManager(id);
        adminList.add(temp);
        return temp;
    }
    
    public void removeAdmin(BloodBankManager u){
        adminList.remove(u);
    }

    public BloodBankManagerDirectory() {
    }
    
    
}
