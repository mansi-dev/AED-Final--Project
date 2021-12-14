/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea;

import Business.BloodBank.BloodStock;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Hospital.Hospital;
import Business.Network.Network;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organizations;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RecieverBloodWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mansizope
 */
public class ManageBloodRequest extends javax.swing.JPanel {

    UserAccount account;
    Organizations organization;
    Enterprise enterprise;
    EcoSystem ecosystem;

    /**
     * Creates new form ManageDonateBloodRequest
     */
    public ManageBloodRequest(UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        populateRequestTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donorTrnTable = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE RECIEVER REQUEST");

        donorTrnTable.setBackground(new java.awt.Color(255, 204, 204));
        donorTrnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        donorTrnTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        donorTrnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Name", "Age", "Weight", "Height", "Hemoglobin Level", "Number of Units", "Price", "Requested Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(donorTrnTable);
        if (donorTrnTable.getColumnModel().getColumnCount() > 0) {
            donorTrnTable.getColumnModel().getColumn(0).setMinWidth(1);
            donorTrnTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            donorTrnTable.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnApprove.setText("Action");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApprove)
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) donorTrnTable.getModel();
        int selectedRow = donorTrnTable.getSelectedRow();
        if (selectedRow != -1) {
            RecieverBloodWorkRequest db = (RecieverBloodWorkRequest) model.getValueAt(selectedRow, 0);
            if (db.getStatus().equals("Approved")) {
                JOptionPane.showMessageDialog(this, "Request already approved");
            } else {

                Hospital hospital = db.getReceiverTransaction().getHospital();
                BloodStock bloodStock = hospital.getBloodStock().stream().filter(item -> db.getPerson().getBloodGroup().equals(item.getBloodGroup())).findFirst().orElse(null);
                int quant = 0;
                if (bloodStock == null) {
                    JOptionPane.showMessageDialog(this, "Blood Bag not available!");
                    db.setStatus("Rejected");

                } else {
                    quant = bloodStock.getQuantity() - db.getReceiverTransaction().getNumberOfUnits();
                    db.setStatus("Approved");

                    bloodStock.setQuantity(quant);
                }
                db.setResolveDate(new Date());
                db.setReceiver(account);
                populateRequestTable();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a record to approve the request");

        }
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JTable donorTrnTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) donorTrnTable.getModel();
        model.setRowCount(0);
        for (Network n : this.ecosystem.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof HospitalEnterprise) {
                    for (Organizations org : e.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof HospitalOrganization) {
                            DefaultTableModel modelR = (DefaultTableModel) donorTrnTable.getModel();
                            modelR.setRowCount(0);
                            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                                if (request instanceof RecieverBloodWorkRequest) {

                                    Object[] rowTrn = new Object[10];
                                    //row[0] = ++index;

                                    rowTrn[0] = request;
                                    rowTrn[1] = ((RecieverBloodWorkRequest) request).getPerson().getName();
                                    rowTrn[2] = ((RecieverBloodWorkRequest) request).getReceiverTransaction().getAge();
                                    rowTrn[3] = ((RecieverBloodWorkRequest) request).getReceiverTransaction().getWeight();
                                    rowTrn[4] = ((RecieverBloodWorkRequest) request).getReceiverTransaction().getHeight();
                                    rowTrn[5] = ((RecieverBloodWorkRequest) request).getReceiverTransaction().getHblevel();
                                    rowTrn[6] = ((RecieverBloodWorkRequest) request).getReceiverTransaction().getNumberOfUnits();
                                    rowTrn[7] = ((RecieverBloodWorkRequest) request).getReceiverTransaction().getPrice();
                                    rowTrn[8] = request.getRequestDate();
                                    rowTrn[9] = request.getStatus();
                                    modelR.addRow(rowTrn);
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
