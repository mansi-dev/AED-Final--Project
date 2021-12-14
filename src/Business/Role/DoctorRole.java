/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organizations;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HospitalWorkArea.HospitalJPanel;

/**
 *
 * @author mayan
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise,business);
    }
    
    
}
