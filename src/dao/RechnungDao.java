/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Rechnung;

/**
 *
 * @author tn
 */
public class RechnungDao {

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(id) from rechnung");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(Rechnung rechnung) {
        String query = "INSERT INTO rechnung VALUES ('" + rechnung.getId() + "','" + rechnung.getName() + "','" + rechnung.getTelefonnummer() + "','" + rechnung.getEmail() + "','" + rechnung.getDate() + "','" + rechnung.getGesamt() + "','" + rechnung.getCreatedBy() + "')";
        DbOperations.setDataOrDelete(query, "Rechnungsdetails erfolgreich hinzugefügt");
    }

    public static ArrayList<Rechnung> getAllRecordsByAsc(String date) {
        ArrayList<Rechnung> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM rechnung WHERE datum LIKE '%" + date + "%'");
            while (rs.next()) {
                Rechnung rechnung = new Rechnung();
                rechnung.setId(rs.getInt("id"));
                rechnung.setName(rs.getString("name"));
                rechnung.setTelefonnummer(rs.getString("telefonnummer"));
                rechnung.setEmail(rs.getString("email"));
                rechnung.setDate(rs.getString("datum"));
                rechnung.setGesamt(rs.getString("gesamt"));
                rechnung.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(rechnung);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Rechnung> getAllRecordsByDesc(String date) {
        ArrayList<Rechnung> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM rechnung WHERE datum LIKE '%" + date + "%' ORDER BY id DESC");
            while (rs.next()) {
                Rechnung rechnung = new Rechnung();
                rechnung.setId(rs.getInt("id"));
                rechnung.setName(rs.getString("name"));
                rechnung.setTelefonnummer(rs.getString("telefonnummer"));
                rechnung.setEmail(rs.getString("email"));
                rechnung.setDate(rs.getString("datum"));
                rechnung.setGesamt(rs.getString("gesamt"));
                rechnung.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(rechnung);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

}
