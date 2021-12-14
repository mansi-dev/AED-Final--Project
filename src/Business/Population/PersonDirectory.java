/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Population;

import Business.UserAccount.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class PersonDirectory {
    private List<Person> personList = new ArrayList();
    
    public List<Person> getPersonList() {
        return this.personList;
    }
    public User addNewPerson(int id){
        Person person = new Person(id);
        this.personList.add(person);
        return person;
    }

    public void removePerson(Person person){
        this.personList.remove(person);
    }
        public Person getPersonByPhoneNum(long phoneNum){        
        for(Person p : this.personList){            
            if(p.getPhoneNum()==phoneNum) return p;
        }
        return null;
    }
    public Person getPersonByUsername(String userName){        
        for(Person p : this.personList){            
            if(p.getName()==userName) return p;
        }
        return null;
    }
    
}
