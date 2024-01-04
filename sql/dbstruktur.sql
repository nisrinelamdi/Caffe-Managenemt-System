
CREATE DATABASE IF NOT EXISTS cms;


USE cms;



CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255),
    telefonnummer VARCHAR(255),
    adresse VARCHAR(255),
    kennwort VARCHAR(255),
    sicherheitfrage VARCHAR(255),
    antwort VARCHAR(255),
    status VARCHAR(255)
);


CREATE TABLE rechnung (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    telefonnummer VARCHAR(255),
    email VARCHAR(255),
    datum VARCHAR(255),
    gesamt VARCHAR(255),
    createdBy VARCHAR(255)
);


CREATE TABLE produkt (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    kategorie VARCHAR(255),
    preis VARCHAR(255)
);


CREATE TABLE kategorie (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255)
);
