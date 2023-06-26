INSERT INTO wypozyczenia (id, isbn, od, do, id_studenta) VALUES (1, 1111, DATE '1995-07-15', DATE '1996-07-15', 1);
INSERT INTO wypozyczenia (id, isbn, od, do, id_studenta) VALUES (2, 4378, DATE '1994-07-15', DATE '1998-07-15', 2);

INSERT INTO typ_adresu (id, nazwa) VALUES (1, "Korespondencyjny");
INSERT INTO typ_adresu (id, nazwa) VALUES (1, "Zamieszkania");

INSERT INTO platnosci (id, data, kwota, id_studenta) VALUES (1, DATE '2000-07-15', 150, 1);
INSERT INTO platnosci (id, data, kwota, id_studenta) VALUES (2, DATE '2002-07-15', 1150, 1);
INSERT INTO platnosci (id, data, kwota, id_studenta) VALUES (3, DATE '2001-07-15', 27), 1;
INSERT INTO platnosci (id, data, kwota, id_studenta) VALUES (4, DATE '2006-07-15', 2000, 2);
INSERT INTO platnosci (id, data, kwota, id_studenta) VALUES (5, DATE '2004-07-15', 300, 2);

INSERT INTO studenci (id, imie, nazwisko, id_administratora) VALUES (1, "Marian", "Pazdzioh", 1);
INSERT INTO studenci (id, imie, nazwisko, id_administratora) VALUES (2, "Bogdan", "Boner", 1);
INSERT INTO studenci (id, imie, nazwisko, id_administratora) VALUES (3, "Gracjan", "Konar", 1);
INSERT INTO studenci (id, imie, nazwisko, id_administratora) VALUES (4, "Teresa", "Karczek", 1);

INSERT INTO adresy (id, kod_pocztowy, ulica, nr, id_typ_adresu, id_studenta) VALUES (1, "11-111", "Matejki", "7/8", 1, 1);
INSERT INTO adresy (id, kod_pocztowy, ulica, nr, id_typ_adresu, id_studenta) VALUES (2, "12-112", "Bukowa", "1", 2, 1);
INSERT INTO adresy (id, kod_pocztowy, ulica, nr, id_typ_adresu, id_studenta) VALUES (3, "13-114", "Drutu", "12m8", 1, 2);
INSERT INTO adresy (id, kod_pocztowy, ulica, nr, id_typ_adresu, id_studenta) VALUES (4, "12-118", "Kominska", "9", 2, 2);

INSERT INTO kredencjaly (id, login, haslo, czy_zablokowany, id_studenta) VALUES (1, "qwe", "123", "0", 1);
INSERT INTO kredencjaly (id, login, haslo, czy_zablokowany, id_studenta) VALUES (2, "wer", "234", "0", 2);

INSERT INTO oceny (id, ocena, id_studenta, id_przedmiotu) VALUES (1, 3, 1, 1);
INSERT INTO oceny (id, ocena, id_studenta, id_przedmiotu) VALUES (2, 4.5, 1, 2);
INSERT INTO oceny (id, ocena, id_studenta, id_przedmiotu) VALUES (3, 3.5, 1, 2);
INSERT INTO oceny (id, ocena, id_studenta, id_przedmiotu) VALUES (4, 5, 2, 1);

INSERT INTO przedmioty (id, godzina, dzien_tygodnia, semestr, id_sylabus) VALUES (1, '13:30', "Poniedzialek",1,1);
INSERT INTO przedmioty (id, godzina, dzien_tygodnia, semestr, id_sylabus) VALUES (2, '13:30', "Sroda",1,1);

INSERT INTO prowadzący (id, id, imie, nazwisko, stopien_naukowy) VALUES (1, "Teresa", "Karczek", "Magister");

INSERT INTO sylabus (id, ects, nazwa_przedmiotu, opis_przedmiotu) VALUES (1, 15, "Analiza matematyczna", "Bardzo wazny przedmiot ");
INSERT INTO sylabus (id, ects, nazwa_przedmiotu, opis_przedmiotu) VALUES (2, 1, "Etyka", "Platon z grecji costam, costam ...");

INSERT INTO studenci_do_przedmioty (id, id_studenta, id_przedmiotu) VALUES (1,1,2);
INSERT INTO studenci_do_przedmioty (id, id_studenta, id_przedmiotu) VALUES (2,2,1);

INSERT INTO prowadzacy_do_przedmioty (id, id_prowadzacego, id_przedmiotu) VALUES (1, 1, 1);
INSERT INTO prowadzacy_do_przedmioty (id, id_prowadzacego, id_przedmiotu) VALUES (2, 1, 2);
