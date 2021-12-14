package Business;

import Business.Admin.AdminDirectory;
import Business.Government.LicenseDirectory;
import Business.Government.TrainingDirectory;
import Business.BloodBank.BloodBankDirectory;
import Business.BloodBank.BloodBankManagerDirectory;
import Business.Enterprise.Enterprise;
import Business.Hospital.DoctorDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Manager.ManagerDirectory;
import Business.Network.Network;
import Business.Organization.Organizations;
import Business.Population.PersonDirectory;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Government.Admin.GovernmentAdminDirectory;

/**
 *
 * @author mansi
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Network network = system.addNetwork();
        network.setName("HospitalNetwork");
        
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Population", Enterprise.EnterpriseType.Population);
        enterprise.getOrganizationDirectory().createOrganization(Organizations.Type.Person);
        
        
        Enterprise enterpriseHosp = network.getEnterpriseDirectory().createAndAddEnterprise("Hospital", Enterprise.EnterpriseType.Hospital);
        enterpriseHosp.getOrganizationDirectory().createOrganization(Organizations.Type.Hospital);
        enterpriseHosp.getOrganizationDirectory().createOrganization(Organizations.Type.Manager);
        enterpriseHosp.getOrganizationDirectory().createOrganization(Organizations.Type.Doctor);

        Enterprise enterpriseGov = network.getEnterpriseDirectory().createAndAddEnterprise("Government", Enterprise.EnterpriseType.Government);
        enterpriseGov.getOrganizationDirectory().createOrganization(Organizations.Type.Admin);
        enterpriseGov.getOrganizationDirectory().createOrganization(Organizations.Type.Training);
        enterpriseGov.getOrganizationDirectory().createOrganization(Organizations.Type.License);
        
        Enterprise enterpriseBB = network.getEnterpriseDirectory().createAndAddEnterprise("BloodBank", Enterprise.EnterpriseType.BloodBank);
        enterpriseBB.getOrganizationDirectory().createOrganization(Organizations.Type.BloodBank);
        enterpriseBB.getOrganizationDirectory().createOrganization(Organizations.Type.BloodBankManager);

        system.setAdminDirectory(new AdminDirectory());
        system.setPersonDirectory(new PersonDirectory());
        system.setDoctorDirectory(new DoctorDirectory());
        system.setHospitalDirectory(new HospitalDirectory());
        system.setManagerDirectory(new ManagerDirectory());
        system.setGovernmentAdminDirectory(new GovernmentAdminDirectory());
        system.setLicenseDirectory(new LicenseDirectory());
        system.setTrainingDirectory(new TrainingDirectory());
        system.setBloodBankDirectory(new BloodBankDirectory());
        system.setBankManagerDirectory(new BloodBankManagerDirectory());
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        //Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin","sysadmin", "sysadmin", new SystemAdminRole());
        
        return system;
    }
    
}
