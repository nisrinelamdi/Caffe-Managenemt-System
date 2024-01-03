/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caffe.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author tn
 */
public class Home extends javax.swing.JFrame {

    public String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("nisrine02101993@gmail.com")) {
            btnKategorie.setVisible(false);
            btnNeuesProdukt.setVisible(false);
            btnProduktabl.setVisible(false);
            btnUeberpruefen.setVisible(false);
            btnBestellungsdaten.setVisible(false);

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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBestellungsdaten = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnKategorie = new javax.swing.JButton();
        btnNeuesProdukt = new javax.swing.JButton();
        btnProduktabl = new javax.swing.JButton();
        btnUeberpruefen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(9, 112, 43));
        jButton1.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(232, 225, 225));
        jButton1.setText("Abmelden");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 150, 30));

        jButton2.setBackground(new java.awt.Color(9, 112, 43));
        jButton2.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(232, 225, 225));
        jButton2.setText("Bestellung aufgeben");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 210, 30));

        btnBestellungsdaten.setBackground(new java.awt.Color(9, 112, 43));
        btnBestellungsdaten.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        btnBestellungsdaten.setForeground(new java.awt.Color(232, 225, 225));
        btnBestellungsdaten.setText("Rechnung und Bestellungsdaten anzeigen");
        btnBestellungsdaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestellungsdatenActionPerformed(evt);
            }
        });
        getContentPane().add(btnBestellungsdaten, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, -1, 30));

        jButton4.setBackground(new java.awt.Color(9, 112, 43));
        jButton4.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(232, 225, 225));
        jButton4.setText("Kennwort ändern");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 210, 30));

        jButton5.setBackground(new java.awt.Color(9, 112, 43));
        jButton5.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(232, 225, 225));
        jButton5.setText("Sicherheitsfrage Ändern");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 240, 30));

        jButton6.setBackground(new java.awt.Color(9, 112, 43));
        jButton6.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(232, 225, 225));
        jButton6.setText("Beenden");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 210, 120, 30));

        btnKategorie.setBackground(new java.awt.Color(9, 112, 43));
        btnKategorie.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        btnKategorie.setForeground(new java.awt.Color(232, 225, 225));
        btnKategorie.setText("Kategorie Verwalten");
        btnKategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategorieActionPerformed(evt);
            }
        });
        getContentPane().add(btnKategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, 30));

        btnNeuesProdukt.setBackground(new java.awt.Color(9, 112, 43));
        btnNeuesProdukt.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        btnNeuesProdukt.setForeground(new java.awt.Color(232, 225, 225));
        btnNeuesProdukt.setText("Neues Produkt");
        btnNeuesProdukt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeuesProduktActionPerformed(evt);
            }
        });
        getContentPane().add(btnNeuesProdukt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, -1, 30));

        btnProduktabl.setBackground(new java.awt.Color(9, 112, 43));
        btnProduktabl.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        btnProduktabl.setForeground(new java.awt.Color(232, 225, 225));
        btnProduktabl.setText("Produkt anzeigen,bearbeiten & löschen");
        btnProduktabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduktablActionPerformed(evt);
            }
        });
        getContentPane().add(btnProduktabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, -1, 30));

        btnUeberpruefen.setBackground(new java.awt.Color(9, 112, 43));
        btnUeberpruefen.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        btnUeberpruefen.setForeground(new java.awt.Color(232, 225, 225));
        btnUeberpruefen.setText("Benutzer überprüfen");
        btnUeberpruefen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUeberpruefenActionPerformed(evt);
            }
        });
        getContentPane().add(btnUeberpruefen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 660, -1, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CAFFE SYSTEM MANAGEMENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 400, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 20, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/Big background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Wollen Sie wirklich sich abmelden", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Anmelden().setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Wollen Sie wirklich beenden", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnKategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategorieActionPerformed
        // TODO add your handling code here:
        new KategorieVerwalten().setVisible(true);
    }//GEN-LAST:event_btnKategorieActionPerformed

    private void btnNeuesProduktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeuesProduktActionPerformed
        // TODO add your handling code here:
        new NeuesProduktHinzufuegen().setVisible(true);
    }//GEN-LAST:event_btnNeuesProduktActionPerformed

    private void btnProduktablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduktablActionPerformed
        // TODO add your handling code here:
        new Produkt_Anzeigen_Bearbeiten_Löschen().setVisible(true);

    }//GEN-LAST:event_btnProduktablActionPerformed

    private void btnUeberpruefenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUeberpruefenActionPerformed
        // TODO add your handling code here:
        new UeberpruefenBenutzer().setVisible(true);
    }//GEN-LAST:event_btnUeberpruefenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new BestellungAufgeben(email).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBestellungsdatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestellungsdatenActionPerformed
        // TODO add your handling code here:
        new Rechnung_BestellungsdatenAnzeigen().setVisible(true);
    }//GEN-LAST:event_btnBestellungsdatenActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new KennwortAendern(email).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new SicherheitsfrageAendern(email).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBestellungsdaten;
    private javax.swing.JButton btnKategorie;
    private javax.swing.JButton btnNeuesProdukt;
    private javax.swing.JButton btnProduktabl;
    private javax.swing.JButton btnUeberpruefen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}