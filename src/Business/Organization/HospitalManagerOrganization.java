/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Manager.ManagerDirectory;
import Business.Role.ManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class HospitalManagerOrganization extends Organizations {

    private ManagerDirectory managerDirectory;

    public ManagerDirectory getManagerDirectory() {
        return managerDirectory;
    }

    public void setManagerDirectory(ManagerDirectory managerDirectory) {
        this.managerDirectory = managerDirectory;
    }
    
    public HospitalManagerOrganization() {
        super(Organizations.Type.Manager.getValue());
        managerDirectory = new ManagerDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagerRole());
        return roles;
    }
}
