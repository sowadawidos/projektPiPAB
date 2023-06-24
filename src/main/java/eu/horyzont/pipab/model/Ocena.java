import javax.persistence.*;

@Entity
@Table(name = "oceny")
public class Ocena {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private float ocena;

    public Ocena() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }
}