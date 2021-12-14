/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Admin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nishok
 */
public class AdminDirectory {
    private List<Admin> adminList = new ArrayList();
    
    public List<Admin> getAdminList(){
        return this.adminList;
    }
    
    public Admin createAdmin(int id){
        Admin temp = new Admin(id);
        adminList.add(temp);
        return temp;
    }
    
    public void removeAdmin(Admin u){
        adminList.remove(u);
    }
}
