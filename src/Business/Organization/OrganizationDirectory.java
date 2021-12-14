/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organizations.Type;
import java.util.ArrayList;

/**
 *
 * @author mayan
 */
public class OrganizationDirectory {
    
    private ArrayList<Organizations> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organizations> getOrganizationList() {
        return organizationList;
    }
    
    public Organizations createOrganization(Type type){
        Organizations organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.SysAdmin.getValue())){
            organization = new SysAdminOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Person.getValue())){
            organization = new PersonOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Training.getValue())){
            organization = new TrainingOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.License.getValue())){
            organization = new LicenseOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.BloodBank.getValue())){
            organization = new BloodBankOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Manager.getValue())){
            organization = new HospitalManagerOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.BloodBankManager.getValue())){
            organization = new BloodBankManagerOrganization();
            organizationList.add(organization);
        } 
        return organization;
    }
}