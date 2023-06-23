package eu.horyzont.pipab.model;

import javax.persistence.*;

@Entity
@Table(name = "adresy")
public class Adres {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "kod_pocztowy", nullable = false)
    private String kodPocztowy;

    @Column(name = "ulica", nullable = false)
    private String ulica;

    @Column(name = "nr", nullable = false)
    private String nr;

    @ManyToOne
    @JoinColumn(name = "typ_adresu_id")
    private TypAdresu typAdresu;

    public Adres() {
    }

    public Integer getId() {
        return id;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public TypAdresu getTypAdresu() {
        return typAdresu;
    }

    public void setTypAdresu(TypAdresu typAdresu) {
        this.typAdresu = typAdresu;
    }
}
