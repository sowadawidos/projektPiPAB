package eu.horyzont.pipab.model;

import javax.persistence.*;

@Entity
@Table(name = "sylabus")
public class Sylabus {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "ects", nullable = false)
    private Integer ects;

    @Column(name = "nazwa_przedmiotu", nullable = false)
    private String nazwaPrzedmiotu;

    @Column(name = "opis_przedmiotu", nullable = false)
    private String opisPrzedmiotu;

    public Sylabus() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public String getOpisPrzedmiotu() {
        return opisPrzedmiotu;
    }

    public void setOpisPrzedmiotu(String opisPrzedmiotu) {
        this.opisPrzedmiotu = opisPrzedmiotu;
    }
}
