import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "platnosci")
public class Platnosc {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private Date data;

    @Column(nullable = false)
    private int kwota;

    public Platnosc() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getKwota() {
        return kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }
}