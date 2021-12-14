/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Government.TrainingDirectory;
import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mansizope
 */
public class TrainingOrganization extends Organizations{
    private TrainingDirectory trainingDirectory;

    public TrainingDirectory getTrainingDirectory() {
        return trainingDirectory;
    }

    public void setTrainingDirectory(TrainingDirectory trainingDirectory) {
        this.trainingDirectory = trainingDirectory;
    }
    
    public TrainingOrganization(){
        super(Organizations.Type.Training.getValue());
        trainingDirectory = new TrainingDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
}
