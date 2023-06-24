import javax.persistence.*;

@Entity
@Table(name = "kredencjaly")
public class Kredencjaly {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 50, nullable = false)
    private String login;

    @Column(length = 50, nullable = false)
    private String haslo;

    @Column(name = "czy_zablokowany", nullable = false)
    private boolean czyZablokowany;

    public Kredencjaly() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public boolean isCzyZablokowany() {
        return czyZablokowany;
    }

    public void setCzyZablokowany(boolean czyZablokowany) {
        this.czyZablokowany = czyZablokowany;
    }
}