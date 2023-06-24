package eu.horyzont.pipab.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "przedmioty")
public class Przedmiot {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "godzina", nullable = false)
    private Time godzina;

    @Column(name = "dzien_tygodnia", nullable = false)
    private Date dzienTygodnia;

    @Column(name = "semestr", nullable = false)
    private Integer semestr;

    @ManyToMany
    @JoinTable(
            name = "prowadzący_przedmioty",
            joinColumns = @JoinColumn(name = "prowadzący_id"),
            inverseJoinColumns = @JoinColumn(name = "przedmioty_id"))
     private Set<Prowadzacy> przedmiotProwadzacy;

    @ManyToOne
    @JoinColumn(name = "sylabus_id")
    private Sylabus sylabus;

    public Przedmiot() {
    }

    public Integer getId() {
        return id;
    }

    public Time getGodzina() {
        return godzina;
    }

    public void setGodzina(Time godzina) {
        this.godzina = godzina;
    }

    public Date getDzienTygodnia() {
        return dzienTygodnia;
    }

    public void setDzienTygodnia(Date dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }

    public Integer getSemestr() {
        return semestr;
    }

    public void setSemestr(Integer semestr) {
        this.semestr = semestr;
    }

    public Prowadzacy getProwadzacy() {
        return (Prowadzacy) przedmiotProwadzacy;
    }

    public void setProwadzacy(Prowadzacy prowadzacy) {
        this.przedmiotProwadzacy = przedmiotProwadzacy;
    }

    public Sylabus getSylabus() {
        return sylabus;
    }

    public void setSylabus(Sylabus sylabus) {
        this.sylabus = sylabus;
    }
}
