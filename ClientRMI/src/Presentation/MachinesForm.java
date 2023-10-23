/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import server.dao.IDao;
import server.entites.Machine;
import server.entites.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import server.dao.IDao;
import server.entites.Machine;
import server.entites.Salle;

/**
 *
 * @author hp
 */
public class MachinesForm extends javax.swing.JInternalFrame {
IDao<Machine> dao=null;
DefaultTableModel model=null;
    public MachinesForm() {
    try {
        initComponents();
                
   
        model=(DefaultTableModel) jlistemachines.getModel();
        IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
        load();
    } catch (NotBoundException ex) {
        Logger.getLogger(MachinesForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
        Logger.getLogger(MachinesForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (RemoteException ex) {
        Logger.getLogger(MachinesForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
public void load() {
    try {
        model.setRowCount(0);
        for (Machine m : dao.findAll()) {
            model.addRow(new Object[] { m.getId(), m.getRef(),m.getMarque(),m.getPrix() });
        }
    } catch (RemoteException ex) {
        Logger.getLogger(MachinesForm.class.getName()).log(Level.SEVERE, null, ex);
    }
     jlistemachines.setValueAt(4000, 1, 4);
    jlistemachines.setValueAt("code1", 1, 5);
    jlistemachines.setValueAt( "AB55", 1, 3);
    jlistemachines.setValueAt("sony", 1, 2);
    jlistemachines.setValueAt(1, 1, 1);

        System.out.println(jlistemachines);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ajout = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ref = new javax.swing.JLabel();
        mar = new javax.swing.JLabel();
        prix = new javax.swing.JLabel();
        salle = new javax.swing.JLabel();
        reftxt = new javax.swing.JTextField();
        marqtxt = new javax.swing.JTextField();
        pritxt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        filtre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistemachines = new javax.swing.JTable();
        listesalles = new javax.swing.JComboBox();
        sallebox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 51, 153));
        setBorder(javax.swing.BorderFactory.createTitledBorder("G des machines"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        ajout.setBackground(new java.awt.Color(204, 153, 0));
        ajout.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        ajout.setText("Ajouter");
        ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutActionPerformed(evt);
            }
        });

        mod.setBackground(new java.awt.Color(204, 153, 0));
        mod.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        mod.setText("Modifier");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        supp.setBackground(new java.awt.Color(204, 153, 0));
        supp.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        supp.setText("Supprimer");
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/p1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(supp)
                        .addGap(18, 18, 18))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajout)
                .addGap(22, 22, 22)
                .addComponent(mod)
                .addGap(15, 15, 15)
                .addComponent(supp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations machines"));

        ref.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        ref.setText("Réference");

        mar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        mar.setText("Marque");

        prix.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        prix.setText("Prix");

        salle.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        salle.setText("Salle");

        reftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reftxtActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 102, 0));

        filtre.setBackground(new java.awt.Color(102, 102, 255));
        filtre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        filtre.setText(" Filtrer par salles");
        filtre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filtre.setOpaque(true);

        jlistemachines.setBackground(new java.awt.Color(102, 102, 255));
        jlistemachines.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des machines"));
        jlistemachines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Réference", "Marque", "Prix", "Salle"
            }
        ));
        jScrollPane1.setViewportView(jlistemachines);
        jlistemachines.getAccessibleContext().setAccessibleDescription("");

        listesalles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "code1", "code2", "code3" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(filtre)
                .addGap(39, 39, 39)
                .addComponent(listesalles, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtre)
                    .addComponent(listesalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sallebox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "code1", "code2", "code3" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salle)
                            .addComponent(prix)
                            .addComponent(mar)
                            .addComponent(ref))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marqtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pritxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sallebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ref)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marqtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(prix)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pritxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sallebox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reftxtActionPerformed
public class fitrerparsalles extends javax.swing.JInternalFrame {

    DefaultTableModel model = null;
    public fitrerparsalles() {
        initComponents();
        model  = (DefaultTableModel) jlistemachines.getModel();
             // Remplit la table avec des données fictives
            model.addRow(new Object[]{1, "Ref001", "MarqueA", 100.0, "Salle1"});
            model.addRow(new Object[]{2, "Ref002", "MarqueB", 200.0, "Salle2"});
            model.addRow(new Object[]{3, "Ref003", "MarqueC", 300.0, "Salle3"});
        load();
       
    }
    public void load() {
    try {
        Salle selectedSalle = (Salle) listesalles.getSelectedItem();
        if (selectedSalle != null) {
            int selectedSalleId = selectedSalle.getId();
            model.setRowCount(0);

            List<Machine> machines = dao.getMachineBySalle(selectedSalle); // Appel de la méthode RMI pour récupérer les machines par salle

            for (Machine m : machines) {
                model.addRow(new Object[] { m.getId(), m.getRef(), m.getMarque(), m.getPrix() });
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Une erreur s'est produite : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}

    
}
    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        String reference =reftxt.getText();
        String marque = marqtxt.getText();
        Salle salle=(Salle) listesalles.getSelectedItem();
            int prix=pritxt.getComponentCount();
     //Ajoutez le code pour créer et enregistrer une nouvelle machine dans la base de données.


        // Vérifier si un client avec les mêmes coordonnées (nom et prénom) existe déjà
       // if (machineExiste(reference,marque)) {
         //   JOptionPane.showMessageDialog(this, "Une machine avec les mêmes coordonnées existe déjà.");
       // } else {
          // try {
           //Ajouter le client uniquement si aucun client avec les mêmes coordonnées n'existe
             //  dao.create(new Machine(reference,marque,salle));
              // JOptionPane.showMessageDialog(this, "Machine ajouté avec succès.");
              // load();
          //  } catch (RemoteException ex) {
               // Logger.getLogger(MachinesForm.class.getName()).log(Level.SEVERE, null, ex);
       //  }
    //   }
     
            // Crée un modèle de table avec des colonnes ID, Référence, Marque, Prix et Salle
           
            

   
    }//GEN-LAST:event_ajoutActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        String reference =reftxt.getText();
        String marque = marqtxt.getText();
        Salle salle=(Salle) listesalles.getSelectedItem();
        int id=0;
        int prix=pritxt.getColumns();
        Machine m= new Machine(id,reference,marque,prix,salle);
        int reponse=JOptionPane.showConfirmDialog(this, "Voulez vous vraiment modifier cet enregistrement ? ");
        if (id != -1) {
            if (reponse==0){
                try {
                    if(dao.update(m))
                    JOptionPane.showMessageDialog(this,"La modification est faite !");
                    load();
                } catch (RemoteException ex) {
                    Logger.getLogger(MachinesForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else JOptionPane.showMessageDialog(this,"Veuillez sélectionner un client à mettre à jour");
    }//GEN-LAST:event_modActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppActionPerformed
private boolean machineExiste(String reference, String marque) {
    try {
        for (Machine machine : dao.findAll()) {
            if (machine.getRef().equals(reference) && machine.getMarque().equals(marque)) {
                return true; // Un client avec les mêmes coordonnées existe déjà
            }
        }
        return false; // Aucun client avec les mêmes coordonnées n'existe

// TODO add your handling code here:
    } catch (RemoteException ex) {
        Logger.getLogger(MachinesForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel filtre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jlistemachines;
    private javax.swing.JComboBox listesalles;
    private javax.swing.JLabel mar;
    private javax.swing.JTextField marqtxt;
    private javax.swing.JButton mod;
    private javax.swing.JTextField pritxt;
    private javax.swing.JLabel prix;
    private javax.swing.JLabel ref;
    private javax.swing.JTextField reftxt;
    private javax.swing.JLabel salle;
    private javax.swing.JComboBox sallebox1;
    private javax.swing.JButton supp;
    // End of variables declaration//GEN-END:variables

}