/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class UserDirectory {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public UserDirectory(List<User> userList) {
        this.userList = userList;
    }

    public UserDirectory() {
        this.userList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "UserDirectory{" + "userList=" + userList + '}';
    }
    
    public User addNewUser(int id){
        User customer = new User(id) {};
        this.userList.add(customer);
        return customer;
    }

    
    
}
