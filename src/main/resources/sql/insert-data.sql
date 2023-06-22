INSERT INTO wypozyczenia (id, isbn, od, do) VALUES (1, 1111, DATE '1995-07-15', DATE '1996-07-15');
INSERT INTO wypozyczenia (id, isbn, od, do) VALUES (2, 4378, DATE '1994-07-15', DATE '1998-07-15');
INSERT INTO wypozyczenia (id, isbn, od, do) VALUES (3, 8637, DATE '1992-07-15', DATE '1999-07-15');

INSERT INTO platnosci (id, data, kwota) VALUES (1, DATE '2000-07-15', 150);
INSERT INTO platnosci (id, data, kwota) VALUES (2, DATE '2002-07-15', 1150);
INSERT INTO platnosci (id, data, kwota) VALUES (3, DATE '2001-07-15', 27);
INSERT INTO platnosci (id, data, kwota) VALUES (4, DATE '2006-07-15', 2000);
INSERT INTO platnosci (id, data, kwota) VALUES (5, DATE '2004-07-15', 300);

INSERT INTO studenci (id, imie, nazwisko) VALUES (1, "Marian", "Pazdzioh");
INSERT INTO studenci (id, imie, nazwisko) VALUES (2, "Bogdan", "Boner");
INSERT INTO studenci (id, imie, nazwisko) VALUES (3, "Gracjan", "Konar");
INSERT INTO studenci (id, imie, nazwisko) VALUES (4, "Teresa", "Karczek");

INSERT INTO adresy (id, kod_pocztowy, ulica, nr) VALUES (1, "11-111", "Matejki", "7/8");
INSERT INTO adresy (id, kod_pocztowy, ulica, nr) VALUES (2, "12-112", "Bukowa", "1");
INSERT INTO adresy (id, kod_pocztowy, ulica, nr) VALUES (3, "13-114", "Drutu", "12m8");
INSERT INTO adresy (id, kod_pocztowy, ulica, nr) VALUES (4, "12-118", "Kominska", "9");

INSERT INTO kredencjaly (id, login, haslo, czy_zablokowany) VALUES (1, "qwe", "123", "0");
INSERT INTO kredencjaly (id, login, haslo, czy_zablokowany) VALUES (2, "wer", "234", "0");
INSERT INTO kredencjaly (id, login, haslo, czy_zablokowany) VALUES (3, "ert", "345", "0");
INSERT INTO kredencjaly (id, login, haslo, czy_zablokowany) VALUES (4, "rty", "456", "1");

INSERT INTO oceny (id, ocena) VALUES (1, 3);
INSERT INTO oceny (id, ocena) VALUES (2, 4.5);
INSERT INTO oceny (id, ocena) VALUES (3, 3.5);
INSERT INTO oceny (id, ocena) VALUES (4, 5);

INSERT INTO przedmioty (id, godzina, dzien_tygodnia, semestr) VALUES (1, '13:30', "Poniedzialek",1);
INSERT INTO przedmioty (id, godzina, dzien_tygodnia, semestr) VALUES (2, '13:30', "Sroda",1);

INSERT INTO prowadzący (id, id, imie, nazwisko, stopien_naukowy) VALUES (1, "Teresa", "Karczek", "Magister");

INSERT INTO sylabus (id, ects, nazwa_przedmiotu, opis_przedmiotu) VALUES (1, 15, "Analiza matematyczna", "Bardzo wazny przedmiot ");
INSERT INTO sylabus (id, ects, nazwa_przedmiotu, opis_przedmiotu) VALUES (2, 1, "Etyka", "Platon z grecji costam, costam ...");
