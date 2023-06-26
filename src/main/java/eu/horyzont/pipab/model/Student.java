package eu.horyzont.pipab.model;

import javax.persistence.*;

@Entity
@Table(name = "studenci")
public class Student {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 50, nullable = false)
    private String imie;

    @Column(length = 50, nullable = false)
    private String nazwisko;

    @Column(length = 50, nullable = false)
    private String haslo;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}