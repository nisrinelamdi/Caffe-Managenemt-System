/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author tn
 */
public class UserDao {

    public static void save(User user) {
        String query = "INSERT INTO users (name, email, telefonnummer, adresse, kennwort, sicherheitfrage, antwort, status) VALUES ('" + user.getName() + "','" + user.getEmail() + "','" + user.getTelefonNr() + "','" + user.getAdresse() + "','" + user.getKennwort() + "','" + user.getSicherheitFrage() + "','" + user.getAntwort() + "','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval");
    }

    public static User login(String email, String kennwort) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from users where email= '" + email + "'and kennwort='" + kennwort + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return user;

    }

    public static User getSicherheitsfrage(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from users where email = '" + email + "' ");
            while (rs.next()) {
                user = new User();
                user.setSicherheitFrage(rs.getString("sicherheitfrage"));
                user.setAntwort(rs.getString("antwort"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void aktualisieren(String email, String neuesKennwort) {
        String query = "update users set kennwort ='" + neuesKennwort + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Passwort erfolgreich geändert");
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from users where email like'%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setTelefonNr(rs.getString("telefonnummer"));
                user.setAdresse(rs.getString("adresse"));
                user.setSicherheitFrage(rs.getString("sicherheitfrage"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;

    }

    public static void changeStatus(String email, String status) {
        String query = "update users set status = '" + status + "' where email ='" + email + "'";
        DbOperations.setDataOrDelete(query, "Status erfolgreich geändert");

    }

    public static void passwortAendern(String email, String altesKennwort, String neuesKennwort) {
        try {
            ResultSet rs = DbOperations.getData("select * from users where email ='" + email + "' and kennwort ='" + altesKennwort + "'");
            if (rs.next()) {
                aktualisieren(email, neuesKennwort);

            } else {
                JOptionPane.showMessageDialog(null, "Altes Kennwort falsch");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void sicherheitfrageAendern(String email, String kennwort, String sicherheitfrage, String antwort) {
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM users WHERE email = '" + email + "' AND kennwort = '" + kennwort + "'");
            if (rs.next()) {
                aktualisieren(email, sicherheitfrage, antwort);
            } else {
                JOptionPane.showMessageDialog(null, "Falsches Kennwort");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void aktualisieren(String email, String sicherheitfrage, String antwort) {
        String query = "UPDATE users SET sicherheitfrage = '" + sicherheitfrage + "', antwort = '" + antwort + "' WHERE email = '" + email + "'";
        DbOperations.setDataOrDelete(query, "Sicherheitsfrage erfolgreich geändert.");

    }
}
