drop schema public cascade;

drop table wypozyczenia if exists;
create table wypozyczenia (
   id INT NOT NULL,
   isbn INT NOT NULL,
   od DATE,
   do DATE,
   PRIMARY KEY (id)
);

drop table platnosci if exists;
create table platnosci (
   id INT NOT NULL,
   data DATE,
   kwota INT NOT NULL,
   PRIMARY KEY (id)
);

drop table studenci if exists;
create table studenci (
   id INT NOT NULL,
   imie VARCHAR(50) NOT NULL,
   nazwisko VARCHAR(50) NOT NULL,
   haslo VARCHAR(50) NOT NULL,
   PRIMARY KEY (id)
);

drop table typ_adresu if exists;
create table typ_adresu (
   id    INT         NOT NULL,
   nazwa VARCHAR(50) NOT NULL,
   PRIMARY KEY (id)
);

drop table adresy if exists;
create table adresy (
   id            INT         NOT NULL,
   kod_pocztowy  VARCHAR(6)  NOT NULL,
   ulica         VARCHAR(50) NOT NULL,
   nr            VARCHAR(10) NOT NULL,
   typ_adresu_id INT         NOT NULL,
   PRIMARY KEY (id),
   FOREIGN KEY (typ_adresu_id) REFERENCES typ_adresu (id)
);

drop table kredencjaly if exists;
create table kredencjaly (
   id INT NOT NULL,
   login VARCHAR(50) NOT NULL,
   haslo VARCHAR(50) NOT NULL,
   czy_zablokowany BIT NOT NULL,
   PRIMARY KEY (id)
);

drop table oceny if exists;
create table oceny (
   id INT NOT NULL,
   ocena FLOAT NOT NULL,
   PRIMARY KEY (id)
);


drop table przedmioty if exists;
create table przedmioty (
   id INT NOT NULL,
   godzina TIME NOT NULL,
   dzien_tygodnia VARCHAR(50) NOT NULL,
   semestr INT NOT NULL,
   PRIMARY KEY (id)
);

drop table prowadzący if exists;
create table prowadzący (
   id INT NOT NULL,
   imie VARCHAR(50) NOT NULL,
   nazwisko VARCHAR(50) NOT NULL,
   stopien_naukowy VARCHAR(50) NOT NULL,
   PRIMARY KEY (id)
);

drop table sylabus if exists;
create table sylabus (
   id INT NOT NULL,
   ects INT NOT NULL,
   nazwa_przedmiotu VARCHAR(50) NOT NULL,
   opis_przedmiotu VARCHAR(50) NOT NULL,
   PRIMARY KEY (id)
);

