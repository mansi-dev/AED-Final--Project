/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.ArrayList;

/**
 *
 * @author Mayan Mishra
 */
public class TrainingDirectory {
    
    private ArrayList<Training> trainingOrg = new ArrayList();
    
    public ArrayList<Training> getTraining() {
        return trainingOrg;
    }

    public void setTraining(ArrayList<Training> trainingOrg) {
        this.trainingOrg = trainingOrg;
    }
    
        public Training addNewEntry() {
        
        Training newEntry = new Training();
        trainingOrg.add(newEntry);
        return newEntry;

    }

    public void deleteRows(Training selectedRow) {
        this.trainingOrg.remove(selectedRow);
    }

    public void deleteRows(TrainingDirectory selectedRow) {
   }

    
}
