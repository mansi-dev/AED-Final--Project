/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Government.Admin;

import Business.Admin.Admin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mayan Mishra
 */
public class GovernmentAdminDirectory {
    private List<GovernmentAdmin> governmentAdminList = new ArrayList();

    public List<GovernmentAdmin> getGovernmentAdminList() {
        return governmentAdminList;
    }

    public void setGovernmentAdminList(List<GovernmentAdmin> governmentAdminList) {
        this.governmentAdminList = governmentAdminList;
    }
    
    public GovernmentAdmin createGovernmentAdmin(int id){
    GovernmentAdmin temp = new GovernmentAdmin(id);
    governmentAdminList.add(temp);
    return temp;
    }
    
    public void removeAdmin(GovernmentAdmin government){
        governmentAdminList.remove(government);
    }
    
    
}
