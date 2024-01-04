
INSERT INTO users (name, email, telefonnummer, adresse, kennwort, sicherheitfrage, antwort, status)
VALUES ('Nadine', 'Nadine@gmail.com', '0123456789', 'mellensee St.3', 'nadine123', 'qwhats your favorite food', 'answer', 'Pizza');


SELECT * FROM users;


INSERT INTO rechnung (name, telefonnummer, email, datum, gesamt, createdBy)
VALUES ('Nadine', '0123456789', 'Nadine@gmail.com', '02.10.1996', '100', 'Nadine@gmail.com');


SELECT * FROM rechnung;


INSERT INTO produkt (name, kategorie, preis)
VALUES ('Frapuccino', 'Kaffe', '3');


SELECT * FROM produkt;

INSERT INTO kategorie (name)
VALUES ('Kaffe');


SELECT * FROM kategorie;
