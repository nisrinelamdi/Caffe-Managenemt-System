/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author tn
 */
public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "CREATE TABLE users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(200), "
                    + "email VARCHAR(200) UNIQUE, "
                    + "telefonnummer VARCHAR(200), "
                    + "adresse VARCHAR(10), "
                    + "kennwort VARCHAR(200), "
                    + "sicherheitfrage VARCHAR(200), "
                    + "antwort VARCHAR(200), "
                    + "status VARCHAR(200))";
            String adminDetails = "insert into users(name,email,telefonnummer,adresse,kennwort,sicherheitfrage,antwort,status)values('Admin','nisrine02101993@gmail.com','1234567890','Germany','admin','Whats your favourite Meal?','Couscous','true')";
            String kategorieTable = "create table Kategorie(id int AUTO_INCREMENT primary key, name varchar(200))";
            String produktTable = "create table Produkt(id int AUTO_INCREMENT primary key,name varchar (200), kategorie varchar(200), preis varchar (200))";
            String rechnungTable = "create table Rechnung(id int  primary key,name varchar (200), telefonnummer varchar(200), email varchar (200), datum varchar(50), gesamt varchar (200),createdBy varchar(200) )";
            //DbOperations.setDataOrDelete(userTable, "User Table  erfolgreich erstellt!");
            //DbOperations.setDataOrDelete(adminDetails, "Administrator Details erfolgreich hinzugefügt!");
            //DbOperations.setDataOrDelete(kategorieTable, "Kategorie Table  erfolgreich erstellt!");
            //DbOperations.setDataOrDelete(produktTable, "Produkt Table  erfolgreich erstellt!");
            DbOperations.setDataOrDelete(rechnungTable, "Rechnung Table  erfolgreich erstellt!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
