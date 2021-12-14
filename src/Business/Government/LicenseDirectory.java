/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mayan Mishra
 */
public class LicenseDirectory {
    private ArrayList<License> licenseOrg = new ArrayList();

    public ArrayList<License> getLicense() {
        return licenseOrg;
    }

    public void setLicense(ArrayList<License> licenseOrg) {
        this.licenseOrg = licenseOrg;
    }
    
        
    public License addNewEntry() {
        
    License newEntry = new License();
    licenseOrg.add(newEntry);
    return newEntry;

    }

    public void deleteRows(License selectedRow) {
        //licenseOrg.remove(selectedRow);
        this.licenseOrg.remove(selectedRow);
    }

//    public void deleteRows(LicenseDirectory selectedRow) {
//          }
//

    public License addNewEntry(Date expiryDate, Date issueDate, Long licenseNumber, String licenseName) {
    License newEntry = new License(licenseName, issueDate, expiryDate, licenseNumber);
    licenseOrg.add(newEntry);
    return newEntry;
    }


    
}
