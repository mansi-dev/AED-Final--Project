/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class DoctorDirectory {
    
    private List<Doctor> doctorList;

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public DoctorDirectory(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public DoctorDirectory() {
        this.doctorList = new ArrayList<>();
    }
        
    public Doctor addNewDoctor(int id){
        Doctor doc = new Doctor(id);
        this.doctorList.add(doc);
        return doc;
    }
    
    public void deleteDoctor(Doctor doctor){
        this.doctorList.remove(doctor);
    }
    
    public void approveDonor() {
        //approve donor code goes here
    }

    public void approveSample() {
        //approve sample code goes here
    }

    public void forwardRequest() {
        //forward request code goes here
    }

    public void drawSalary() {
        //draw salary code goes here
    }
    
}
