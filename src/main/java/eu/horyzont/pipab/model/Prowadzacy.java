package eu.horyzont.pipab.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "prowadzący")
public class Prowadzacy {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "imie", nullable = false)
    private String imie;

    @Column(name = "nazwisko", nullable = false)
    private String nazwisko;

    @Column(name = "stopien_naukowy", nullable = false)
    private String stopienNaukowy;
    @ManyToMany(mappedBy = "przedmiotProwadzacy")
    private Set<Przedmiot> przedmiot;
    public Prowadzacy() {
    }

    public Integer getId() {
        return id;
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

    public String getStopienNaukowy() {
        return stopienNaukowy;
    }

    public void setStopienNaukowy(String stopienNaukowy) {
        this.stopienNaukowy = stopienNaukowy;
    }
}