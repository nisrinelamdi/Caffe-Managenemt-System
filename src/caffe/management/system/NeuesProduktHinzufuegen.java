/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caffe.management.system;

import dao.KategorieDao;
import dao.ProduktDao;
import java.util.ArrayList;
import java.util.Iterator;
import model.Kategorie;
import model.Produkt;

/**
 *
 * @author tn
 */
public class NeuesProduktHinzufuegen extends javax.swing.JFrame {

    /**
     * Creates new form NeuesProduktHinzufuegen
     */
    public NeuesProduktHinzufuegen() {
        initComponents();
        btnSpeichern.setEnabled(false);
    }

    public void validateFields() {
        String name = txtName.getText();
        double preis = 0.0;
        try {
            preis = Double.parseDouble(txtPreis.getText());
        } catch (NumberFormatException e) {
            // Gérez l'exception si la conversion en double échoue
        }

        if (!name.equals("") && preis >= 0.0) {
            btnSpeichern.setEnabled(true);
        } else {
            btnSpeichern.setEnabled(false);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPreis = new javax.swing.JTextField();
        txtKategorie = new javax.swing.JComboBox<>();
        btnSpeichern = new javax.swing.JButton();
        btnEntfernen = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Neues Produkt");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, 40));

        jLabel2.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, -1));

        jLabel3.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kategorie");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, -1));

        jLabel4.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 70, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 380, -1));

        txtPreis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPreis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPreisKeyReleased(evt);
            }
        });
        getContentPane().add(txtPreis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 380, -1));

        txtKategorie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtKategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 380, -1));

        btnSpeichern.setBackground(new java.awt.Color(255, 255, 255));
        btnSpeichern.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnSpeichern.setForeground(new java.awt.Color(0, 0, 0));
        btnSpeichern.setText("Speichern");
        btnSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeichernActionPerformed(evt);
            }
        });
        getContentPane().add(btnSpeichern, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        btnEntfernen.setBackground(new java.awt.Color(255, 255, 255));
        btnEntfernen.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnEntfernen.setForeground(new java.awt.Color(0, 0, 0));
        btnEntfernen.setText("Entfernen");
        btnEntfernen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntfernenActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntfernen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 20, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/blausmallbackground.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();

    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPreisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreisKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPreisKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ArrayList<Kategorie> list = KategorieDao.getAllRecords();
        Iterator<Kategorie> itr = list.iterator();
        while (itr.hasNext()) {
            Kategorie kategorieObj = itr.next();
            txtKategorie.addItem(kategorieObj.getName());
        }

    }//GEN-LAST:event_formComponentShown

    private void btnSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeichernActionPerformed
        // TODO add your handling code here:
        Produkt produkt = new Produkt();
        produkt.setName(txtName.getText());
        produkt.setKategorie((String) txtKategorie.getSelectedItem());
        produkt.setPreis(txtPreis.getText());
        ProduktDao.save(produkt);
        setVisible(false);
        new NeuesProduktHinzufuegen().setVisible(true);

    }//GEN-LAST:event_btnSpeichernActionPerformed

    private void btnEntfernenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntfernenActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new NeuesProduktHinzufuegen().setVisible(true);
    }//GEN-LAST:event_btnEntfernenActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NeuesProduktHinzufuegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeuesProduktHinzufuegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeuesProduktHinzufuegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeuesProduktHinzufuegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeuesProduktHinzufuegen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntfernen;
    private javax.swing.JButton btnSpeichern;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> txtKategorie;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPreis;
    // End of variables declaration//GEN-END:variables
}
