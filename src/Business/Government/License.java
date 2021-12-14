/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.Date;

/**
 *
 * @author mayan
 */
public class License {

    
    
    
    public License(){
    //this.license = new LicenseOrganization();
    }
    
    public int getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(int licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Long getIssueNumber() {
        return licenseNumber;
    }

    public void setIssueNumber(Long licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    private int licenseId;
    private String licenseName;
    private Date issueDate;
    private Date expiryDate;
    private Long licenseNumber;
    private static int counter =0 ;

    public License(String licenseName, Date issueDate, Date expiryDate, Long licenseNumber) {
        this.licenseId = ++counter;
        this.licenseName = licenseName;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "LicenseOrganization{" + "licenseId=" + licenseId + ", licenseName=" + licenseName + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", licenseNumber=" + licenseNumber + '}';
    }
    

    
        
}
