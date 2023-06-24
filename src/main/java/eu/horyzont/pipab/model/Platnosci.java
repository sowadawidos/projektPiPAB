@Entity
@Table
public class Platnosc
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    @Table(name="platnosci") 	
	@Id
    @GeneratedValue
    private int id;
    @NotNull
	private Date data;
     @NotNull
	private int kwota;

	public Platnosc(Date data, Date kwota) 
	{
		super( );
		this.data = data;
		this.kwota = kwota;
	}
	
	public Platnosc( ) 
	{
		super();
	}
	
	public int getData( ) 
	{
		return data;
	}
	public void setData(Date data)  
	{
		this.data = data;
	}
    public String getKwota( ) 
	{
		return kwota;
	}
	public void setKwota(int kwota) 
	{
		this.kwota = kwota;
	}
}