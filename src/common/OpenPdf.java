/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

public class OpenPdf {

    public static void openById(String id) {
        try {
            File pdfFile = new File("C:\\Users\\tn\\Desktop\\NesrineMiniProjekt\\Caffe Management System\\" + id + ".pdf");

            if (pdfFile.exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdfFile.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "Die Datei existiert nicht");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler beim Öffnen der Datei: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        openById("example");
    }
}
