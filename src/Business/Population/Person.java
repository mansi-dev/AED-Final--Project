/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Population;

import Business.UserAccount.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansizope
 */
public class Person extends User{
    private List<DonorTransaction> donorTransactionList = new ArrayList<>();
    private List<ReceiverTransaction> receiverTransactionList = new ArrayList<>();
    
    private String bloodGroup;

    public Person(List<DonorTransaction> donorTransaction, List<ReceiverTransaction> receiverTransaction) {
        this.donorTransactionList = donorTransaction;
        this.receiverTransactionList = receiverTransaction;
    }

    public List<DonorTransaction> getDonorTransaction() {
        return donorTransactionList;
    }

    public void setDonorTransaction(List<DonorTransaction> donorTransaction) {
        this.donorTransactionList = donorTransaction;
    }

    public List<ReceiverTransaction> getReceiverTransaction() {
        return receiverTransactionList;
    }

    public void setReceiverTransaction(List<ReceiverTransaction> receiverTransaction) {
        this.receiverTransactionList = receiverTransaction;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
  
    public DonorTransaction addNewDonorTransaction(){
        DonorTransaction donorTransaction = new DonorTransaction();
        this.donorTransactionList.add(donorTransaction);
        return donorTransaction;
    }

    public void removeDonorTransaction(DonorTransaction donorTransaction){
        this.donorTransactionList.remove(donorTransaction);
    }
    
    public void removeRecieverTransaction(ReceiverTransaction resTransaction){
        this.receiverTransactionList.remove(resTransaction);
    }
    
    public ReceiverTransaction addNewReceiverTransaction(){
        ReceiverTransaction receiverTransaction = new ReceiverTransaction();
        this.receiverTransactionList.add(receiverTransaction);
        return receiverTransaction;
    }

    public void removePerson(ReceiverTransaction receiverTransaction){
        this.receiverTransactionList.remove(receiverTransaction);
    }

    public Person(int id) {
        super(id);
    }
}
