@Entity
@Table
public class Credential
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    @Table(name="kredencjaly") 	
	@Id
    @GeneratedValue
    private int id;
    @NotNull
    @Column(length = 50)
	private String login;
    @NotNull
    @Column(length = 50)
	private String haslo;
    @NotNull
    @Column(name="czy_zablokowany")
	private boolean czyZablokowany;

	public Credential(String login, String haslo, boolean czyZablokowany)
	{
		super( );
		this.login = login;
		this.haslo = haslo;
		this.czyZablokowany = czyZablokowany;
	}
	
	public Credential( ) 
	{
		super();
	}
	
	public int getLogin( ) 
	{
		return login;
	}
	public void setLogin(String login)  
	{
		this.login = login;
	}
    public String getHaslo( ) 
	{
		return haslo;
	}
	public void setHaslo(String haslo) 
	{
		this.haslo = haslo;
	}
	
	public double getCzyZablokowany( ) 
	{
		return czyZablokowany;
	}
	public void setCzyZablokowany(boolean czyZablokowany) 
	{
		this.czyZablokowany = czyZablokowany;
	}
}