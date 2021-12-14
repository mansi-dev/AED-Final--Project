/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Admin.Admin;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Population.Person;
import Business.Role.Role;
//import Business.UserAccount.User.Role;
import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String name, String username, String password, Role role){
        if(!checkIfUsernameIsUnique(username)) 
            return null;
UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
//        if(role instanceof Business.Role.PersonRole){
//            userAccount.setUser(EcoSystem.getInstance().getPersonDirectory().addNewPerson(userAccount.getAccountId()));
//        } else if(role instanceof Business.Role.ManagerRole){
//            userAccount.setUser(EcoSystem.getInstance().getManagerDirectory().createManager(userAccount.getAccountId()));
//        }
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public int deleteAccount(int id){
        int userAccountFound=0;
        for(UserAccount u : userAccountList){
            if(u.getAccountId()==id){
                userAccountList.remove(u);
                User user = u.getUser();
//                if(u.getRole()==Role.Admin) EcoSystem.getInstance().getAdminDirectory().removeAdmin((Admin)user);
//                if(u.getRole()==Role.Person) EcoSystem.getInstance().getPersonDirectory().removePerson((Person)user);
                userAccountFound=1;
                break;
            }
        }
        return userAccountFound;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
