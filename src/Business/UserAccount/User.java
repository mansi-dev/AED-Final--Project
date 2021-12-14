/* * @author mansi

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

/**
 *
 */
public abstract class User {
    private int id;
    public String name;
    private String address;
    private String email;
    private long phoneNum;
    private String city;
    private String state;
    private String zipCode;
    
    public User() {}
    
    public User(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public User(int id, String name, String address, String email, long phoneNum, String city, String state, String zipCode) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
 
    
    
    public enum Role{
        Manager("Manager"),
        Person("Person"),
        Admin("Admin"),
        SysAdmin("Sysadmin"),
        Doctor("Doctor"),
        GovernmentAdmin("GovernmentAdmin"),
        BloodBankManager("BloodBankManager");
        private String value;
        private Role(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
}
