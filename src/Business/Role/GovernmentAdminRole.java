/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organizations;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.GovernmentRole.GovernmentWorkArea;

/**
 *
 * @author mansi
 */
public class GovernmentAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new GovernmentWorkArea(userProcessContainer,account,  organization,enterprise, business);
    }

    
    
}
