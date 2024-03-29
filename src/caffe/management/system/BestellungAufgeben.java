/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caffe.management.system;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPdf;
import dao.KategorieDao;
import dao.ProduktDao;
import dao.RechnungDao;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Kategorie;
import model.Produkt;
import model.Rechnung;

/**
 *
 * @author tn
 */
public class BestellungAufgeben extends javax.swing.JFrame {

    public int rechnungId = 1;
    public int gesamtSumme = 0;
    public int produktPreis = 0;
    public int produktGesamt = 0;
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String telefonnummerPattern = "^[0-9]*$";
    public String userEmail;

    /**
     * Creates new form BestellungAufgeben
     */
    public BestellungAufgeben() {
        initComponents();
    }

    public BestellungAufgeben(String email) {
        initComponents();
        txtProduktName.setEditable(false);
        txtProduktPreis.setEditable(false);
        txtProduktGesamt.setEditable(false);
        btnWarenkorb.setEnabled(false);
        btnDrucken.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        tf.setEditable(false);
        userEmail = email;

    }

    public void produktNameByKategorie(String kategorie) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Produkt> list = ProduktDao.getAllRecordsByKategorie(kategorie);
        Iterator<Produkt> itr = list.iterator();
        while (itr.hasNext()) {
            Produkt produktObj = itr.next();
            dtm.addRow(new Object[]{produktObj.getName()});

        }

    }

    public void filterProduktByName(String name, String kategorie) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Produkt> list = ProduktDao.filterProduktByName(name, kategorie);
        Iterator<Produkt> itr = list.iterator();
        while (itr.hasNext()) {
            Produkt produktObj = itr.next();
            dtm.addRow(new Object[]{produktObj.getName()});

        }

    }

    public void clearProduktFields() {
        txtProduktName.setText("");
        txtProduktPreis.setText("");
        jSpinner1.setValue(1);
        txtProduktGesamt.setText("");
        btnWarenkorb.setEnabled(false);

    }

    public void validateField() {
        String kundenName = txtKundenName.getText();
        String kundenTelefonNr = txtKundenTelefonNr.getText();
        String kundenEmail = txtKundenEmail.getText();
        if (!kundenEmail.equals("") && kundenTelefonNr.matches(telefonnummerPattern) && kundenTelefonNr.length() == 10 && kundenEmail.matches(emailPattern) && gesamtSumme > 0) {
            btnDrucken.setEnabled(true);

        } else {
            btnDrucken.setEnabled(false);
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
        txtKundenName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKundenTelefonNr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKundenEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtSuche = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtProduktName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtProduktPreis = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txtProduktGesamt = new javax.swing.JTextField();
        btnLeeren = new javax.swing.JButton();
        btnWarenkorb = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGesamt = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        btnDrucken = new javax.swing.JButton();
        labelGesamtsumme = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Nova Cond", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BESTELLUNG AUFGEBEN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, -1));

        jLabel2.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rechnung Id :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, -1));

        jLabel3.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kundendetails :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 160, -1));

        jLabel4.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, -1));

        txtKundenName.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        txtKundenName.setForeground(new java.awt.Color(0, 0, 0));
        txtKundenName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKundenNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtKundenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 280, -1));

        jLabel5.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefonnummer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 170, -1));

        txtKundenTelefonNr.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        txtKundenTelefonNr.setForeground(new java.awt.Color(0, 0, 0));
        txtKundenTelefonNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKundenTelefonNrActionPerformed(evt);
            }
        });
        txtKundenTelefonNr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKundenTelefonNrKeyReleased(evt);
            }
        });
        getContentPane().add(txtKundenTelefonNr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 280, -1));

        jLabel6.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 130, -1));

        txtKundenEmail.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        txtKundenEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtKundenEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKundenEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtKundenEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 290, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("--");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, -1));

        jLabel8.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Kategorie");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 70, -1));

        jComboBox1.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 330, -1));

        jLabel9.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Suche");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 50, -1));

        txtSuche.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        txtSuche.setForeground(new java.awt.Color(0, 0, 0));
        txtSuche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSucheMouseClicked(evt);
            }
        });
        txtSuche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSucheKeyReleased(evt);
            }
        });
        getContentPane().add(txtSuche, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 330, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 330, -1));

        jLabel10.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 90, -1));

        txtProduktName.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        getContentPane().add(txtProduktName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 300, -1));

        jLabel11.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Preis");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, 50, -1));

        txtProduktPreis.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        getContentPane().add(txtProduktPreis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, 260, -1));

        jLabel12.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Menge");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 120, -1));

        jSpinner1.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 300, -1));

        jLabel13.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Gesamt");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 80, -1));

        txtProduktGesamt.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        txtProduktGesamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduktGesamtActionPerformed(evt);
            }
        });
        getContentPane().add(txtProduktGesamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 230, 250, -1));

        btnLeeren.setBackground(new java.awt.Color(24, 153, 67));
        btnLeeren.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnLeeren.setForeground(new java.awt.Color(255, 255, 255));
        btnLeeren.setText("Leeren");
        btnLeeren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerenActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeeren, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 90, -1));

        btnWarenkorb.setBackground(new java.awt.Color(24, 153, 67));
        btnWarenkorb.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnWarenkorb.setForeground(new java.awt.Color(255, 255, 255));
        btnWarenkorb.setText("In den Warenkorb ");
        btnWarenkorb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarenkorbActionPerformed(evt);
            }
        });
        getContentPane().add(btnWarenkorb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 270, -1, -1));

        tblGesamt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Preis", "Menge", "Gesamt"
            }
        ));
        tblGesamt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGesamtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGesamt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 570, 350));

        jLabel14.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Gesamtsumme: €");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 710, 130, 20));

        btnDrucken.setBackground(new java.awt.Color(24, 153, 67));
        btnDrucken.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        btnDrucken.setForeground(new java.awt.Color(249, 245, 245));
        btnDrucken.setText("Rechnung erstellen und drucken");
        btnDrucken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDruckenActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrucken, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, 270, 30));

        labelGesamtsumme.setFont(new java.awt.Font("Arial Nova Cond", 1, 14)); // NOI18N
        labelGesamtsumme.setForeground(new java.awt.Color(0, 0, 0));
        labelGesamtsumme.setText("000");
        getContentPane().add(labelGesamtsumme, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 710, 70, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("X");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 20, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/Big background.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKundenTelefonNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKundenTelefonNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKundenTelefonNrActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        rechnungId = Integer.parseInt(RechnungDao.getId());
        jLabel7.setText(RechnungDao.getId());
        ArrayList<Kategorie> list = KategorieDao.getAllRecords();
        Iterator<Kategorie> itr = list.iterator();
        while (itr.hasNext()) {
            Kategorie kategorieObj = itr.next();
            jComboBox1.addItem(kategorieObj.getName());
        }
        String kategorie = (String) jComboBox1.getSelectedItem();
        produktNameByKategorie(kategorie);
    }//GEN-LAST:event_formComponentShown

    private void txtSucheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSucheKeyReleased
        // TODO add your handling code here:
        String name = txtSuche.getText();
        String kategorie = (String) jComboBox1.getSelectedItem();
        filterProduktByName(name, kategorie);

    }//GEN-LAST:event_txtSucheKeyReleased

    private void txtSucheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSucheMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSucheMouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int menge = (Integer) jSpinner1.getValue();
        if (menge <= 1) {
            jSpinner1.setValue(1);
            menge = 1;

        }
        produktGesamt = produktPreis * menge;
        txtProduktGesamt.setText(String.valueOf(produktGesamt));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String kategorie = (String) jComboBox1.getSelectedItem();
        produktNameByKategorie(kategorie);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnWarenkorbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarenkorbActionPerformed
        // TODO add your handling code here:
        String name = txtProduktName.getText();
        String preis = txtProduktPreis.getText();
        String menge = String.valueOf(jSpinner1.getValue());
        DefaultTableModel dtm = (DefaultTableModel) tblGesamt.getModel();
        dtm.addRow(new Object[]{name, preis, menge, produktGesamt});
        gesamtSumme = gesamtSumme + produktGesamt;
        labelGesamtsumme.setText(String.valueOf(gesamtSumme));
        clearProduktFields();
        validateField();

    }//GEN-LAST:event_btnWarenkorbActionPerformed

    private void btnLeerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerenActionPerformed
        // TODO add your handling code here:
        clearProduktFields();

    }//GEN-LAST:event_btnLeerenActionPerformed

    private void txtKundenNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKundenNameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtKundenNameKeyReleased

    private void txtKundenTelefonNrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKundenTelefonNrKeyReleased
        // TODO add your handling code here:
        validateField();

    }//GEN-LAST:event_txtKundenTelefonNrKeyReleased

    private void txtKundenEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKundenEmailKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtKundenEmailKeyReleased

    private void txtProduktGesamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduktGesamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduktGesamtActionPerformed

    private void btnDruckenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDruckenActionPerformed
        // TODO add your handling code here:
        String kundenName = txtKundenName.getText();
        String kundenTelefonNr = txtKundenTelefonNr.getText();
        String kundenEmail = txtKundenEmail.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String todaydate = dFormat.format(date);
        String gesamt = String.valueOf(gesamtSumme);
        String createdBy = userEmail;
        Rechnung rechnung = new Rechnung();
        rechnung.setId(rechnungId);
        rechnung.setName(kundenName);
        rechnung.setTelefonnummer(kundenTelefonNr);
        rechnung.setEmail(kundenEmail);
        rechnung.setDate(todaydate);
        rechnung.setGesamt(gesamt);
        rechnung.setCreatedBy(createdBy);
        RechnungDao.save(rechnung);

        //create dokument
        String path = "C:\\Users\\tn\\Desktop\\NesrineMiniProjekt\\Caffe Management System\\";

        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + rechnungId + ".pdf"));
            doc.open();
            Paragraph cafeName = new Paragraph("                                                                 Cafe Management System");
            doc.add(cafeName);
            Paragraph starLine = new Paragraph("****************************************************************************************************************");
            doc.add(starLine);
            Paragraph paragraph3 = new Paragraph("\tRechnung ID: " + rechnungId + "\nKundenname: " + kundenName + "\nGesamtsumme: " + gesamtSumme + " €");
            doc.add(paragraph3);
            doc.add(starLine);
            PdfPTable tbl = new PdfPTable(4);
            tbl.addCell("Name");
            tbl.addCell("Preis pro Stück");
            tbl.addCell("Menge");
            tbl.addCell("Gesamtsumme");
            for (int i = 0; i < tblGesamt.getRowCount(); i++) {
                String n = tblGesamt.getValueAt(i, 0).toString();
                String d = tblGesamt.getValueAt(i, 1).toString();
                String r = tblGesamt.getValueAt(i, 2).toString();
                String q = tblGesamt.getValueAt(i, 3).toString();
                tbl.addCell(n);
                tbl.addCell(d);
                tbl.addCell(r);
                tbl.addCell(q);

            }
            doc.add(tbl);
            doc.add(starLine);
            Paragraph dankeMsg = new Paragraph("Herzlichen Dank für Ihre Bestellung.Beste Grüße");
            doc.add(dankeMsg);
            OpenPdf.openById(String.valueOf(rechnungId));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        setVisible(false);
        new BestellungAufgeben(createdBy).setVisible(true);

    }//GEN-LAST:event_btnDruckenActionPerformed

    private void tblGesamtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGesamtMouseClicked
        // TODO add your handling code here:
        int index = tblGesamt.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Möchten Sie dieses Produkt entfernen?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            TableModel model = tblGesamt.getModel();
            String gesamt = model.getValueAt(index, 3).toString();
            gesamtSumme = gesamtSumme - Integer.parseInt(gesamt);
            labelGesamtsumme.setText(String.valueOf(gesamtSumme));
            ((DefaultTableModel) tblGesamt.getModel()).removeRow(index);
        }

    }//GEN-LAST:event_tblGesamtMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String produktName = model.getValueAt(index, 0).toString();
        Produkt produkt = ProduktDao.getProduktByName(produktName);
        txtProduktName.setText(produkt.getName());
        txtProduktPreis.setText(produkt.getPreis());
        jSpinner1.setValue(1);
        txtProduktPreis.setText(produkt.getPreis());
        produktPreis = Integer.parseInt(produkt.getPreis());
        produktGesamt = Integer.parseInt(produkt.getPreis());
        btnWarenkorb.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new Home(userEmail).setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(BestellungAufgeben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BestellungAufgeben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BestellungAufgeben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BestellungAufgeben.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BestellungAufgeben().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrucken;
    private javax.swing.JButton btnLeeren;
    private javax.swing.JButton btnWarenkorb;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelGesamtsumme;
    private javax.swing.JTable tblGesamt;
    private javax.swing.JTextField txtKundenEmail;
    private javax.swing.JTextField txtKundenName;
    private javax.swing.JTextField txtKundenTelefonNr;
    private javax.swing.JTextField txtProduktGesamt;
    private javax.swing.JTextField txtProduktName;
    private javax.swing.JTextField txtProduktPreis;
    private javax.swing.JTextField txtSuche;
    // End of variables declaration//GEN-END:variables
}
