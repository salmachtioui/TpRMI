/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import server.dao.IDao;
import server.entites.Machine;
import server.entites.Salle;

/**
 *
 * @author hp
 */
public class SallaForm extends javax.swing.JInternalFrame {
IDao<Salle> dao1=null;
DefaultTableModel model=null;
    public SallaForm() {
    try {
        initComponents();
        model=(DefaultTableModel) jlistesalles.getModel();
        IDao<Salle> dao1 = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/dao1");
        load();
    } catch (NotBoundException ex) {
        Logger.getLogger(SallaForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
        Logger.getLogger(SallaForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (RemoteException ex) {
        Logger.getLogger(SallaForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
public void load() {
    try {
        model.setRowCount(0);
        for (Salle s : dao1.findAll()) {
            model.addRow(new Object[] { s.getId(), s.getCode() });
        }
    } catch (RemoteException ex) {
        Logger.getLogger(SallaForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Buttonajouter = new javax.swing.JButton();
        Buttonmodifier = new javax.swing.JButton();
        Buttonsupprimer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistesalles = new javax.swing.JTable();
        jPanelcode = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("G Salles");

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        Buttonajouter.setBackground(new java.awt.Color(204, 153, 0));
        Buttonajouter.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Buttonajouter.setText("Ajouter");
        Buttonajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonajouterActionPerformed(evt);
            }
        });

        Buttonmodifier.setBackground(new java.awt.Color(204, 153, 0));
        Buttonmodifier.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Buttonmodifier.setText("Modifier");
        Buttonmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonmodifierActionPerformed(evt);
            }
        });

        Buttonsupprimer.setBackground(new java.awt.Color(204, 153, 0));
        Buttonsupprimer.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Buttonsupprimer.setText("Supprimer");
        Buttonsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Buttonajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Buttonsupprimer)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Buttonmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Buttonajouter)
                .addGap(29, 29, 29)
                .addComponent(Buttonmodifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Buttonsupprimer)
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listes des salles"));

        jlistesalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Code"
            }
        ));
        jScrollPane1.setViewportView(jlistesalles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanelcode.setBackground(new java.awt.Color(0, 51, 153));
        jPanelcode.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations Salle"));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText(" Code");

        javax.swing.GroupLayout jPanelcodeLayout = new javax.swing.GroupLayout(jPanelcode);
        jPanelcode.setLayout(jPanelcodeLayout);
        jPanelcodeLayout.setHorizontalGroup(
            jPanelcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcodeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanelcodeLayout.setVerticalGroup(
            jPanelcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcodeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/p1.png"))); // NOI18N
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonajouterActionPerformed
    try {
        String code=txtcode.getText().toString();
        dao1.create(new Salle(code));
        load();
    } catch (RemoteException ex) {
        Logger.getLogger(SallaForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ButtonajouterActionPerformed

    private void ButtonsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsupprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonsupprimerActionPerformed

    private void ButtonmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonmodifierActionPerformed
        String code =txtcode.getText();
          int id=0;
       Salle s= new Salle(id,code);
        int reponse=JOptionPane.showConfirmDialog(this, "Voulez vous vraiment modifier cet enregistrement ? ");
        if (id != -1) {
       if (reponse==0){
           try {
               if(dao1.update(s))
                   JOptionPane.showMessageDialog(this,"La modification est faite !");
               load();
           } catch (RemoteException ex) {
               Logger.getLogger(SallaForm.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        }else JOptionPane.showMessageDialog(this,"Veuillez sélectionner un client à mettre à jour");      
    }//GEN-LAST:event_ButtonmodifierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonajouter;
    private javax.swing.JButton Buttonmodifier;
    private javax.swing.JButton Buttonsupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelcode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jlistesalles;
    private javax.swing.JTextField txtcode;
    // End of variables declaration//GEN-END:variables

}