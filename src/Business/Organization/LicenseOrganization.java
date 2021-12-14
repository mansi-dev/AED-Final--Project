/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Government.LicenseDirectory;
import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class LicenseOrganization extends Organizations {

    private LicenseDirectory licenseDirectory;
    
    public LicenseOrganization() {
        super(Organizations.Type.License.getValue());
        licenseDirectory = new LicenseDirectory();
    }

    public LicenseDirectory getLicenseDirectory() {
        return licenseDirectory;
    }

    public void setLicenseDirectory(LicenseDirectory licenseDirectory) {
        this.licenseDirectory = licenseDirectory;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
}
