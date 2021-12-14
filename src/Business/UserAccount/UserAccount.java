/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.Role;
//import Business.UserAccount.User.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author mansi
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private User user;
    private Role role;
    private WorkQueue workQueue;
    private static int counter=0;
    private int accountId;

    public UserAccount() {
        //accountId = ++counter;
        workQueue = new WorkQueue();
    }
    
    public UserAccount(String name, String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
        accountId = ++counter;
//        if(role==Role.Admin)this.user = EcoSystem.getInstance().getAdminDirectory().createAdmin(accountId);
//        if(role==Role.Person)this.user = EcoSystem.getInstance().getPersonDirectory().addNewPerson(accountId);
//        if(role==Role.Doctor)this.user = EcoSystem.getInstance().getDoctorDirectory().addNewDoctor(accountId);
//        if(role==Role.Manager)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
//        if(role==Role.GovernmentAdmin)this.user = EcoSystem.getInstance().getGovernmentAdminDirectory().createGovernmentAdmin(accountId);
//        if(role==Role.BloodBankManager)this.user = EcoSystem.getInstance().getBankManagerDirectory().createAdmin(accountId);

        this.user.setName(name);
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}