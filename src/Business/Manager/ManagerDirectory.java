/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import Business.EcoSystem;
import Business.Hospital.Hospital;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class ManagerDirectory {
    private List<Manager> managerList = new ArrayList();
    public List<Hospital> hospitalList = new ArrayList();
    
    public List<Manager> getManagerList(){
        return this.managerList;
    }
    
    public Manager createManager(int id){
        Manager temp = new Manager(id);
        managerList.add(temp);
        return temp;
    }
    public int updateManager(String name, int id, int hospitalID){
        Manager temp=new Manager(id);
        int checkIfManagerFound=0;        
        for(Manager m:this.getManagerList()){
            if(m.getId()==id){
                for(Hospital hosp:EcoSystem.getInstance().getHospitalDirectory().getHospitalList()){
                    if(hosp.getId()==hospitalID){                        
                        checkIfManagerFound=1;
                        m.setHospitalByID(hospitalID);
                        m.setName(name);
                        break;
                    }
                }                   
            }
        }
        return checkIfManagerFound;
    } 
    
    public void removeManager(Manager d){
        managerList.remove(d);
    }
    
    public void removeManagerById(int id){
        int checkIfManagerFound=0;
        for(Manager m : this.managerList){
            if(m.getId()==id){
                checkIfManagerFound=1;
                this.managerList.remove(m);
                return;
            }
        }
    }
}
