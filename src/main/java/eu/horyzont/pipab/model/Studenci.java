@Entity
@Table
public class Student
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    @Table(name="studenci") 	
	@Id
    @GeneratedValue
    private int id;
    @NotNull
    @Column(length = 50)
	private String imie;
    @NotNull
    @Column(length = 50)
	private String nazwisko;
    @NotNull
    @Column(length = 50)
	private String haslo;

	public Student(String imie, String nazwisko, String haslo) 
	{
		super( );
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.haslo = haslo;
	}
	
	public Student( ) 
	{
		super();
	}
	
	public int getImie( ) 
	{
		return imie;
	}
	public void setImie(String imie)  
	{
		this.imie = imie;
	}
    public String getNazwisko( ) 
	{
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) 
	{
		this.nazwisko = nazwisko;
	}
	
	public double getHaslo( ) 
	{
		return haslo;
	}
	public void setHaslo(String haslo) 
	{
		this.haslo = haslo;
	}

    @Override
    public String getFullName() {
    return  imie + nazwisko
   }
}