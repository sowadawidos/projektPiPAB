package eu.horyzont.pipab.model;

import javax.persistence.*;

@Entity
@Table(name = "administratorzy")
public class Administrator {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    @JoinColumn(name = "id_studenta")
    private Student student;

    public Administrator(){}


}
