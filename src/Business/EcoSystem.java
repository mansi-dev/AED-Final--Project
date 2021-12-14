/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Admin.AdminDirectory;
import Business.BloodBank.BloodBankDirectory;
import Business.BloodBank.BloodBankManagerDirectory;
import Business.Government.LicenseDirectory;
import Business.Government.TrainingDirectory;
import Business.Hospital.DoctorDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Manager.ManagerDirectory;
import Business.Network.Network;
import Business.Organization.OrganizationDirectory;
import Business.Organization.Organizations;
import Business.Population.PersonDirectory;
import Business.Population.Receiver;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Government.Admin.GovernmentAdminDirectory;
import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class EcoSystem extends Organizations {

    private static EcoSystem business;

    private Receiver recieverDirectory;
    private AdminDirectory adminDirectory;
    private PersonDirectory personDirectory;
    private DoctorDirectory doctorDirectory;
    private HospitalDirectory hospitalDirectory;
    private ManagerDirectory managerDirectory;
    private TrainingDirectory trainingDirectory;
    private LicenseDirectory licenseDirectory;
    private GovernmentAdminDirectory governmentAdminDirectory;
    private BloodBankDirectory bloodBankDirectory;
    private BloodBankManagerDirectory bankManagerDirectory;
    private ArrayList<Network> networkList;
    private OrganizationDirectory organizationDirectory;

    public BloodBankDirectory getBloodBankDirectory() {
        return bloodBankDirectory;
    }

    public void setBloodBankDirectory(BloodBankDirectory bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }

    public BloodBankManagerDirectory getBankManagerDirectory() {
        return bankManagerDirectory;
    }

    public void setBankManagerDirectory(BloodBankManagerDirectory bankManagerDirectory) {
        this.bankManagerDirectory = bankManagerDirectory;
    }

    public GovernmentAdminDirectory getGovernmentAdminDirectory() {
        return governmentAdminDirectory;
    }

    public void setGovernmentAdminDirectory(GovernmentAdminDirectory governmentAdminDirectory) {
        this.governmentAdminDirectory = governmentAdminDirectory;
    }

    public EcoSystem(Receiver recieverDirectory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, TrainingDirectory trainingDirectory, LicenseDirectory licenseDirectory) {

        this.recieverDirectory = recieverDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.licenseDirectory = licenseDirectory;
        this.trainingDirectory = trainingDirectory;

    }

    public TrainingDirectory getTrainingDirectory() {
        return trainingDirectory;
    }

    public void setTrainingDirectory(TrainingDirectory trainingDirectory) {
        this.trainingDirectory = trainingDirectory;
    }

    public LicenseDirectory getLicenseDirectory() {
        return licenseDirectory;
    }

    public void setLicenseDirectory(LicenseDirectory licenseDirectory) {
        this.licenseDirectory = licenseDirectory;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        organizationDirectory = new OrganizationDirectory();

    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network addNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(AdminDirectory adminDirectory) {
        this.adminDirectory = adminDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public Receiver getRecieverDirectory() {
        return recieverDirectory;
    }

    public void setRecieverDirectory(Receiver recieverDirectory) {
        this.recieverDirectory = recieverDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public ManagerDirectory getManagerDirectory() {
        return managerDirectory;
    }

    public void setManagerDirectory(ManagerDirectory managerDirectory) {
        this.managerDirectory = managerDirectory;
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}
