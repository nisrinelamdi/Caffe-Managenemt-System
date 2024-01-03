/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Kategorie;

/**
 *
 * @author tn
 */
public class KategorieDao {

    public static void save(Kategorie kategorie) {
        String query = "insert into kategorie(name)values('" + kategorie.getName() + "') ";
        DbOperations.setDataOrDelete(query, "Kategorie erfolgreich hinzugefügt!");
    }

    public static ArrayList<Kategorie> getAllRecords() {
        ArrayList<Kategorie> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select *from kategorie");
            while (rs.next()) {
                Kategorie kategorie = new Kategorie();
                kategorie.setId(rs.getInt("id"));
                kategorie.setName(rs.getString("name"));
                arrayList.add(kategorie);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;

    }

    public static void delete(String id) {
        String query = "delete from kategorie where id ='" + id + "'";
        DbOperations.setDataOrDelete(query, "Kategorie wurde erfolgreich gelöscht!");
    }

}
