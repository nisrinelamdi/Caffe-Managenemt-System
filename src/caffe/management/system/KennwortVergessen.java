/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caffe.management.system;

import dao.UserDao;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author tn
 */
public class KennwortVergessen extends javax.swing.JFrame {

    private String dbAntwort = null;
    private String email = null;
    private String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form PawwordVergessen
     */
    public KennwortVergessen() {
        initComponents();
        btnAktualisieren.setEnabled(false);
        btnSuchen.setEnabled(false);
        txtSicherheitsfrage.setEditable(false);

    }

    public void clear() {
        btnAktualisieren.setEnabled(false);
        btnSuchen.setEnabled(false);
        txtEmail.setEditable(true);
        txtEmail.setText("");
        txtSicherheitsfrage.setText("");
        txtAntwort.setText("");
        txtNeuesKennwort.setText("");

    }

    public void validateEmail() {
        email = txtEmail.getText();
        if (email.matches(emailPattern)) {
            btnSuchen.setEnabled(true);
        } else {
            btnSuchen.setEnabled(false);
        }
    }

    public void validateFields() {
        String kennwort = txtNeuesKennwort.getText();
        String antwort = txtAntwort.getText();
        String sicherheitsfrage = txtSicherheitsfrage.getText();
        if (!kennwort.equals("") && !antwort.equals("") && !sicherheitsfrage.equals("")) {
            btnAktualisieren.setEnabled(true);
        } else {
            btnAktualisieren.setEnabled(false);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSicherheitsfrage = new javax.swing.JTextField();
        txtAntwort = new javax.swing.JTextField();
        txtNeuesKennwort = new javax.swing.JPasswordField();
        btnAktualisieren = new javax.swing.JButton();
        btnEntfernen = new javax.swing.JButton();
        btnRegistrieren = new javax.swing.JButton();
        btnBeenden = new javax.swing.JButton();
        btnAnmelden = new javax.swing.JButton();
        btnSuchen = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Nova Cond Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kennwort Vergessen ? ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 240, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Nova Cond Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 150, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial Nova Cond Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ihre Sicherheitsfrage");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial Nova Cond Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ihre Antwort");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial Nova Cond Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Neues Kennwort");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 150, 20));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 410, 30));

        txtSicherheitsfrage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSicherheitsfrage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSicherheitsfrageActionPerformed(evt);
            }
        });
        txtSicherheitsfrage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSicherheitsfrageKeyReleased(evt);
            }
        });
        getContentPane().add(txtSicherheitsfrage, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 410, 30));

        txtAntwort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAntwort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAntwortKeyReleased(evt);
            }
        });
        getContentPane().add(txtAntwort, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 410, 30));

        txtNeuesKennwort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNeuesKennwort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNeuesKennwortKeyReleased(evt);
            }
        });
        getContentPane().add(txtNeuesKennwort, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 410, 30));

        btnAktualisieren.setBackground(new java.awt.Color(24, 153, 67));
        btnAktualisieren.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnAktualisieren.setForeground(new java.awt.Color(246, 243, 243));
        btnAktualisieren.setText("Kennwort aktualisieren");
        btnAktualisieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAktualisierenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAktualisieren, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        btnEntfernen.setBackground(new java.awt.Color(24, 153, 67));
        btnEntfernen.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnEntfernen.setForeground(new java.awt.Color(246, 243, 243));
        btnEntfernen.setText("Entfernen");
        btnEntfernen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntfernenActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntfernen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 100, -1));

        btnRegistrieren.setBackground(new java.awt.Color(24, 153, 67));
        btnRegistrieren.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnRegistrieren.setForeground(new java.awt.Color(246, 243, 243));
        btnRegistrieren.setText("Registrieren");
        btnRegistrieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrierenActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrieren, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        btnBeenden.setBackground(new java.awt.Color(24, 153, 67));
        btnBeenden.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnBeenden.setForeground(new java.awt.Color(246, 243, 243));
        btnBeenden.setText("Beenden");
        btnBeenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeendenActionPerformed(evt);
            }
        });
        getContentPane().add(btnBeenden, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 100, -1));

        btnAnmelden.setBackground(new java.awt.Color(24, 153, 67));
        btnAnmelden.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnAnmelden.setForeground(new java.awt.Color(246, 243, 243));
        btnAnmelden.setText("Anmelden");
        btnAnmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnmeldenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnmelden, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, -1, -1));

        btnSuchen.setBackground(new java.awt.Color(24, 153, 67));
        btnSuchen.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnSuchen.setForeground(new java.awt.Color(246, 243, 243));
        btnSuchen.setText("Suche");
        btnSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuchenActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuchen, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1343, 0, 20, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/Big background.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSicherheitsfrageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSicherheitsfrageActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSicherheitsfrageActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSicherheitsfrageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSicherheitsfrageKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtSicherheitsfrageKeyReleased

    private void txtAntwortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAntwortKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAntwortKeyReleased

    private void txtNeuesKennwortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNeuesKennwortKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNeuesKennwortKeyReleased

    private void btnBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeendenActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Wollen Sie wirklich beenden?", "Select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnBeendenActionPerformed

    private void btnEntfernenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntfernenActionPerformed
        // TODO add your handling code here:
        clear();

    }//GEN-LAST:event_btnEntfernenActionPerformed

    private void btnAktualisierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAktualisierenActionPerformed
        // TODO add your handling code here:
        String antwort = txtAntwort.getText();
        String neuesKennwort = txtNeuesKennwort.getText();
        if (antwort.equals(dbAntwort)) {
            UserDao.aktualisieren(email, neuesKennwort);
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Falsche Antwort</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAktualisierenActionPerformed

    private void btnSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuchenActionPerformed
        // TODO add your handling code here:
        email = txtEmail.getText();
        User user = null;
        user = UserDao.getSicherheitsfrage(email);

        if (user == null) {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Falsches Kennwort</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            btnSuchen.setEnabled(false);
            txtEmail.setEditable(false);
            dbAntwort = user.getAntwort();
            txtSicherheitsfrage.setText(user.getSicherheitFrage());
            validateFields();
        }

    }//GEN-LAST:event_btnSuchenActionPerformed

    private void btnRegistrierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrierenActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Registrieren().setVisible(true);

    }//GEN-LAST:event_btnRegistrierenActionPerformed

    private void btnAnmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnmeldenActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Anmelden().setVisible(true);
    }//GEN-LAST:event_btnAnmeldenActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(KennwortVergessen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KennwortVergessen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KennwortVergessen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KennwortVergessen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KennwortVergessen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAktualisieren;
    private javax.swing.JButton btnAnmelden;
    private javax.swing.JButton btnBeenden;
    private javax.swing.JButton btnEntfernen;
    private javax.swing.JButton btnRegistrieren;
    private javax.swing.JButton btnSuchen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAntwort;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNeuesKennwort;
    private javax.swing.JTextField txtSicherheitsfrage;
    // End of variables declaration//GEN-END:variables
}
