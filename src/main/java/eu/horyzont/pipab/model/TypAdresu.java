package eu.horyzont.pipab.model;

import javax.persistence.*;

@Entity
@Table(name = "typ_adresu")
public class TypAdresu {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nazwa", nullable = false)
    private String nazwa;

    public TypAdresu() {
    }

    public Integer getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
