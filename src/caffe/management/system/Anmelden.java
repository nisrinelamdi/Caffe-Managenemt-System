/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caffe.management.system;

import dao.UserDao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author tn
 */
public class Anmelden extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form Einloggen
     */
    public Anmelden() {
        initComponents();
        btnAnmelden.setEnabled(false);

    }

    public void validateFields() {
        String email = txtEmail.getText();
        String kennwort = txtKennwort.getText();
        if (email.matches(emailPattern) && !kennwort.equals("")) {
            btnAnmelden.setEnabled(true);
        } else {
            btnAnmelden.setEnabled(false);

        }
    }

    public void clear() {
        txtEmail.setText("");
        txtKennwort.setText("");
        btnAnmelden.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEinloggen = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelKennwort = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtKennwort = new javax.swing.JPasswordField();
        btnAnmelden = new javax.swing.JButton();
        btnEntfernen = new javax.swing.JButton();
        btnBeenden = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEinloggen.setBackground(new java.awt.Color(255, 255, 255));
        labelEinloggen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEinloggen.setForeground(new java.awt.Color(0, 0, 0));
        labelEinloggen.setText("Anmelden");
        getContentPane().add(labelEinloggen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 231, 39));

        labelEmail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email");
        getContentPane().add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 70, 30));

        labelKennwort.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        labelKennwort.setForeground(new java.awt.Color(0, 0, 0));
        labelKennwort.setText("Kennwort");
        getContentPane().add(labelKennwort, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 90, 30));

        txtEmail.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 410, -1));

        txtKennwort.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        txtKennwort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKennwortKeyReleased(evt);
            }
        });
        getContentPane().add(txtKennwort, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 410, -1));

        btnAnmelden.setBackground(new java.awt.Color(24, 153, 67));
        btnAnmelden.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnAnmelden.setForeground(new java.awt.Color(246, 245, 245));
        btnAnmelden.setText("Anmelden");
        btnAnmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnmeldenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnmelden, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, 30));

        btnEntfernen.setBackground(new java.awt.Color(24, 153, 67));
        btnEntfernen.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnEntfernen.setForeground(new java.awt.Color(246, 245, 245));
        btnEntfernen.setText("Entfernen");
        btnEntfernen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntfernenActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntfernen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 130, 30));

        btnBeenden.setBackground(new java.awt.Color(24, 153, 67));
        btnBeenden.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnBeenden.setForeground(new java.awt.Color(246, 245, 245));
        btnBeenden.setText("Beenden");
        btnBeenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeendenActionPerformed(evt);
            }
        });
        getContentPane().add(btnBeenden, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 130, 30));

        jButton4.setBackground(new java.awt.Color(24, 153, 67));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(246, 245, 245));
        jButton4.setText("Kennwort vergessen ?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, 30));

        jButton5.setBackground(new java.awt.Color(24, 153, 67));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(246, 245, 245));
        jButton5.setText("Registrieren");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cafe Management System");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 450, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/Big background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnmeldenActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String kennwort = txtKennwort.getText();
        User user = null;
        user = UserDao.login(email, kennwort);
        if (user == null) {
            JOptionPane.showMessageDialog(null, "<html> <b style =\"color:red\">Falscher Benutzername oder falsches Passwort </b></html>", "Mssage", JOptionPane.ERROR_MESSAGE);
        } else {
            if (user.getStatus().equals("false")) {
                ImageIcon icon = new ImageIcon("src/popupicon/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b> Bitte um Geduld, bis der Administrator Ihre Anfrage bestätigt </b></html>", "Message", JOptionPane.INFORMATION_MESSAGE, icon);
                clear();
            }
            if (user.getStatus().equals("true")) {
                setVisible(false);
                new Home(email).setVisible(true);
            }
        }

    }//GEN-LAST:event_btnAnmeldenActionPerformed

    private void btnEntfernenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntfernenActionPerformed
        // TODO add your handling code here:
        clear();

    }//GEN-LAST:event_btnEntfernenActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Registrieren().setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeendenActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Wollen Sie wirklich beenden?", "Select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnBeendenActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtKennwortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKennwortKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtKennwortKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new KennwortVergessen().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Anmelden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anmelden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anmelden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anmelden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anmelden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnmelden;
    private javax.swing.JButton btnBeenden;
    private javax.swing.JButton btnEntfernen;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelEinloggen;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelKennwort;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtKennwort;
    // End of variables declaration//GEN-END:variables
}
