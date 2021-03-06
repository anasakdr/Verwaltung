/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *Die Klasse Gruppen represntiert eine grphicher benutzeroberfläche
 * inder der anwender seine Gruppen verwalten kann.
 * 
 * @author AAlakdr
 * @version 0.1
 */
public class Gruppe extends javax.swing.JPanel {
 public static PreparedStatement ps = null;
    public static ResultSet rs = null;
    String s;
    DefaultTableModel model;
    int rowCount;
    /**
     * Creates new form Gruppe
     */
    public Gruppe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameFeld = new javax.swing.JTextField();
        erstellenB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gruppenLöschen = new javax.swing.JButton();
        comboListe = new javax.swing.JComboBox();
        mailFeld = new javax.swing.JTextField();
        addB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mitglieder = new javax.swing.JTable();
        zurückB = new javax.swing.JButton();
        loeschen = new javax.swing.JButton();
        zeigenB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 102, 122));

        erstellenB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        erstellenB.setForeground(new java.awt.Color(60, 15, 108));
        erstellenB.setText("Gruppe erstellen");
        erstellenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erstellenBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Neue Gruppe");

        gruppenLöschen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gruppenLöschen.setForeground(new java.awt.Color(60, 15, 108));
        gruppenLöschen.setText("Gruppe löschen");
        gruppenLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruppenLöschenActionPerformed(evt);
            }
        });

        comboListe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboListe.setForeground(new java.awt.Color(60, 15, 108));

        mailFeld.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        addB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addB.setForeground(new java.awt.Color(60, 15, 108));
        addB.setText("Benutzer hinzufügen");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        mitglieder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "E-Mail"
            }
        ));
        jScrollPane1.setViewportView(mitglieder);

        zurückB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        zurückB.setForeground(new java.awt.Color(60, 15, 108));
        zurückB.setText("Zurück");
        zurückB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zurückBActionPerformed(evt);
            }
        });

        loeschen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loeschen.setForeground(new java.awt.Color(60, 15, 108));
        loeschen.setText("Benutzer entfernen");
        loeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loeschenActionPerformed(evt);
            }
        });

        zeigenB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        zeigenB.setForeground(new java.awt.Color(60, 15, 108));
        zeigenB.setText("Anzeigen");
        zeigenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeigenBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("Gruppenliste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(erstellenB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(mailFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addB)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gruppenLöschen)
                            .addComponent(comboListe, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(zurückB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loeschen)
                .addGap(113, 113, 113)
                .addComponent(zeigenB)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erstellenB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(gruppenLöschen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboListe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeigenB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zurückB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void erstellenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erstellenBActionPerformed
        int gruppenId = 0;
        if (!Utils.isEmpty(nameFeld.getText())) {
            try {
                s = "SELECT * FROM gruppen WHERE Name=? ";
                ps = Utils.getConnection().prepareStatement(s);
                ps.setString(1, nameFeld.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Diese Gruppe existiert bereits");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
            }
            s = "INSERT INTO gruppen(Name,creatorId)VALUES(?,?)";
            try {
                ps = Utils.getConnection().prepareStatement(s);
                ps.setString(1, nameFeld.getText());
                ps.setInt(2, Main.userId);
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            try {
                s = "SELECT ID FROM gruppen WHERE Name=? ";
                ps = Utils.getConnection().prepareStatement(s);
                ps.setString(1, nameFeld.getText());
                rs = ps.executeQuery();
                nameFeld.setText("");
                JOptionPane.showMessageDialog(null, "Neue Gruppe erfolgreich erstellt");
                while (rs.next()) {
                    gruppenId = rs.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
            }
            s = "INSERT INTO gruppenxmitglieder(userid,gruppenid)VALUES(?,?)";
            try {
                ps = Utils.getConnection().prepareStatement(s);
                ps.setInt(1, Main.userId);
                ps.setInt(2, gruppenId);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                
            }

            Gruppe.liste();
        } else {
            JOptionPane.showMessageDialog(null, "Sie müssen einen Namen für die Gruppe eingeben");
            return;
        }
    }//GEN-LAST:event_erstellenBActionPerformed

    private void gruppenLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruppenLöschenActionPerformed
       if (comboListe.getSelectedItem() != null) {
            String name = comboListe.getSelectedItem().toString().toUpperCase();
            int ii = JOptionPane.showConfirmDialog(null, "Sind Sie sicher, dass Sie die Gruppe  '" + name + "'  löschen möchten?", "Sicherheitsabfrage", JOptionPane.OK_CANCEL_OPTION);
            if (ii == JOptionPane.OK_OPTION) {
                try {
                    ps = Utils.getConnection().prepareStatement("DELETE FROM  gruppen WHERE Name=?");
                    ps.setString(1, name);
                    ps.executeUpdate();
                    Gruppe.liste();
                    JOptionPane.showMessageDialog(null, "Sie haben die Gruppe gelöscht");
                    show1();
                } catch (SQLException ex) {
                    Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
                    //Zeig mir Massege
                    JOptionPane.showMessageDialog(null, "Das Gruppe konnte nicht gelöscht werden");
                }
            } else if (ii == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, ":)", "Sicherheitsabfrage", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "keine Gruppe ausgewählt");
            return;
        }
    }//GEN-LAST:event_gruppenLöschenActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
       if (comboListe.getSelectedItem() != null) {
            int userid = 0;
            int gruppenId = 0;
            if (!Utils.isEmpty(mailFeld.getText())) {
                try {
                    s = "SELECT ID FROM users WHERE Mail=? ";
                    ps = Utils.getConnection().prepareStatement(s);

                    ps.setString(1, mailFeld.getText());
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        userid = rs.getInt(1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Diese E-Mail existiert nicht ");
                        return;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    s = "SELECT ID FROM gruppen WHERE Name=? ";
                    ps = Utils.getConnection().prepareStatement(s);
                    ps.setString(1, comboListe.getSelectedItem().toString());
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        gruppenId = rs.getInt(1);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    s = "SELECT userid, gruppenid FROM gruppenxmitglieder WHERE userid=? AND gruppenid=? ";
                    ps = Utils.getConnection().prepareStatement(s);
                    ps.setInt(1, userid);
                    ps.setInt(2, gruppenId);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Der Benutzer ist schon in der Gruppe");
                        mailFeld.setText("");
                        return;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
                }

                s = "INSERT INTO gruppenxmitglieder(userid,gruppenid)VALUES(?,?)";
                try {
                    ps = Utils.getConnection().prepareStatement(s);
                    ps.setInt(1, userid);
                    ps.setInt(2, gruppenId);
                    ps.executeUpdate();
                    show1();
                } catch (SQLException ex) {
                    Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Das Feld ist leer");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sie haben keine Gruppe ausgewählt");
            return;
        }
    }//GEN-LAST:event_addBActionPerformed

    private void loeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loeschenActionPerformed
        int userid = 0;

        int selectedRow = mitglieder.getSelectedRow();

        // if(selectedRow!=null)
        model = (DefaultTableModel) mitglieder.getModel();
        /// wenn die user nicht selected
        if (mitglieder.getSelectedRow() >=0) {
            String sss = model.getValueAt(selectedRow, 1).toString();
            int ii = JOptionPane.showConfirmDialog(null, "Sind Sie sicher, dass Sie den Benutzer löschen wollen?", "Sicherheitsabfrage", JOptionPane.OK_CANCEL_OPTION);
            // wenn die antwort okay ist
            if (ii == JOptionPane.OK_OPTION) {
                try {
                    s = "SELECT ID FROM users WHERE Mail=? ";
                    ps = Utils.getConnection().prepareStatement(s);

                    ps.setString(1, sss);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        userid = rs.getInt(1);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(userid==Main.userId){
                    JOptionPane.showMessageDialog(null,"Sie Könne sich nicht selber Löschen");
                    return;
                }

                try {
                    ps = Utils.getConnection().prepareStatement("DELETE FROM  gruppenxmitglieder WHERE userid=?");
                    ps.setInt(1, userid);
                    ps.executeUpdate();
                    Gruppe.liste();
                    JOptionPane.showMessageDialog(null, "Benutzer erfolgreich aus der Gruppe gelöscht");
                    show1();
                } catch (SQLException ex) {
                    Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
                    //Zeig mir Massege
                    JOptionPane.showMessageDialog(null, "Der Benutzer konnte nicht gelöscht werden");
                }

            } else if (ii == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, ":)", "Sicherheitsabfrage", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kein Benutzer ausgewählt");
        }
    }//GEN-LAST:event_loeschenActionPerformed

    private void zeigenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeigenBActionPerformed
       int gruppenId = 0;
        model = (DefaultTableModel) mitglieder.getModel();
        rowCount = model.getRowCount();
        //Löcht alle zeile von unsere Tabelle
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            s = "SELECT ID FROM gruppen WHERE Name=? ";
            ps = Utils.getConnection().prepareStatement(s);
            ps.setString(1, comboListe.getSelectedItem().toString());
            rs = ps.executeQuery();
            while (rs.next()) {
                gruppenId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String query = "SELECT * FROM users u ,gruppenxmitglieder mit  WHERE u.ID=mit.userid AND mit.gruppenid=?";
            ps = Utils.getConnection().prepareStatement(query);
            ps.setInt(1, gruppenId);
            rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2), rs.getString(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(PasswortListe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_zeigenBActionPerformed

    private void zurückBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zurückBActionPerformed
        
        Main.cl.show(Main.cardPanel, "UserMenue");
        mailFeld.setText("");
        nameFeld.setText("");
         int gruppenId = 0;
        model = (DefaultTableModel) mitglieder.getModel();
        rowCount = model.getRowCount();
        //Löcht alle zeile von unsere Tabelle
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }//GEN-LAST:event_zurückBActionPerformed
public void show1() {
        int gruppenId = 0;
        try {
            s = "SELECT ID FROM gruppen WHERE Name=? ";
            ps = Utils.getConnection().prepareStatement(s);
            ps.setString(1, comboListe.getSelectedItem().toString());
            rs = ps.executeQuery();
            while (rs.next()) {
                gruppenId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
        }
        model = (DefaultTableModel) mitglieder.getModel();
        rowCount = model.getRowCount();
        //Löcht alle zeile von unsere Tabelle
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        try {
            String query = "SELECT u.Name,u.Mail FROM users u,gruppenxmitglieder gm WHERE gm.userid=u.ID AND gm.gruppenid=? ";

            ps = Utils.getConnection().prepareStatement(query);
            ps.setInt(1, gruppenId);
            rs = ps.executeQuery();
            mailFeld.setText("");
            while (rs.next()) {

                model.addRow(new Object[]{rs.getString(1), rs.getString(2)});

            }
        } catch (SQLException ex) {
            Logger.getLogger(PasswortListe.class.getName()).log(Level.SEVERE, null, ex);
        }
    } public static void liste() {
        comboListe.removeAllItems();
        try {
            String ss = "SELECT Name FROM gruppen WHERE creatorId=?";
            ps = Utils.getConnection().prepareStatement(ss);
            ps.setInt(1, Main.userId);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Name");
                comboListe.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gruppe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private static javax.swing.JComboBox comboListe;
    private javax.swing.JButton erstellenB;
    private javax.swing.JButton gruppenLöschen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loeschen;
    private javax.swing.JTextField mailFeld;
    private javax.swing.JTable mitglieder;
    private javax.swing.JTextField nameFeld;
    private javax.swing.JButton zeigenB;
    private javax.swing.JButton zurückB;
    // End of variables declaration//GEN-END:variables
}
