/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Population.Person;
import Business.Population.ReceiverTransaction;

/**
 *
 * @author mansizope
 */
public class RecieverBloodWorkRequest extends WorkRequest{
    private Person person;
    private ReceiverTransaction reciReceiverTransaction;
    private String requestApproved;

    public ReceiverTransaction getReceiverTransaction() {
        return reciReceiverTransaction;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setReceiverTransaction(ReceiverTransaction reciReceiverTransaction) {
        this.reciReceiverTransaction = reciReceiverTransaction;
    }

    public String getRequestApproved() {
        return requestApproved;
    }

    public void setRequestApproved(String requestApproved) {
        this.requestApproved = requestApproved;
    }
    
    
}
