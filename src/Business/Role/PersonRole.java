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
import userinterface.Population.ChooseUserJPanel;

/**
 *
 * @author neeraja
 */
public class PersonRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new ChooseUserJPanel(userProcessContainer, account,organization,enterprise,  business);
    }
    
}
