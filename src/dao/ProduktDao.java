/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produkt;

/**
 *
 * @author tn
 */
public class ProduktDao {

    public static void save(Produkt produkt) {
        String query = "insert into produkt (name,kategorie,preis) values ('" + produkt.getName() + "','" + produkt.getKategorie() + "','" + produkt.getPreis() + "')";
        DbOperations.setDataOrDelete(query, "Neues Produkt erfolgreich hinzugefügt.");

    }

    public static ArrayList<Produkt> getAllRecords() {
        ArrayList<Produkt> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from produkt");
            while (rs.next()) {
                Produkt produkt = new Produkt();
                produkt.setId(rs.getInt("id"));
                produkt.setName(rs.getString("name"));
                produkt.setKategorie(rs.getString("kategorie"));
                produkt.setPreis(rs.getString("preis"));
                arrayList.add(produkt);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arrayList;
    }

    public static void update(Produkt produkt) {
        String query = "update produkt set name='" + produkt.getName() + "',kategorie='" + produkt.getKategorie() + "',preis='" + produkt.getPreis() + "' where id ='" + produkt.getId() + "'";
        DbOperations.setDataOrDelete(query, "Produkt erfolgreich aktualisiert");

    }

    public static void delete(String id) {
        String query = "delete from produkt where id ='" + id + "'";
        DbOperations.setDataOrDelete(query, "Produkt erfolgreich gelöscht");

    }

    public static ArrayList<Produkt> getAllRecordsByKategorie(String kategorie) {
        ArrayList<Produkt> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from produkt where kategorie ='" + kategorie + "'");
            while (rs.next()) {
                Produkt produkt = new Produkt();
                produkt.setName(rs.getString("name"));
                arrayList.add(produkt);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return arrayList;

    }

    public static ArrayList<Produkt> filterProduktByName(String name, String kategorie) {
        ArrayList<Produkt> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM produkt WHERE name LIKE '%" + name + "%' AND kategorie ='" + kategorie + "'");
            while (rs.next()) {
                Produkt produkt = new Produkt();
                produkt.setName(rs.getString("name"));
                arrayList.add(produkt);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static Produkt getProduktByName(String name) {
        Produkt produkt = new Produkt();
        try {
            ResultSet rs = DbOperations.getData("select * from produkt where name= '" + name + "'");
            while (rs.next()) {
                produkt.setName(rs.getString(2));
                produkt.setKategorie(rs.getString(3));
                produkt.setPreis(rs.getString(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return produkt;
    }

}
