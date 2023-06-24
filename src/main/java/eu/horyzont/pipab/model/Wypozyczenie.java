import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wypozyczenia")
public class Wypozyczenie {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private int isbn;

    @Column(name = "od", nullable = false)
    private Date odData;

    @Column(name = "do", nullable = false)
    private Date doData;

    public Wypozyczenie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Date getOdData() {
        return odData;
    }

    public void setOdData(Date odData) {
        this.odData = odData;
    }

    public Date getDoData() {
        return doData;
    }

    public void setDoData(Date doData) {
        this.doData = doData;
    }
}