@Entity
@Table
public class Ocena
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    @Table(name="oceny") 	
	@Id
    @GeneratedValue
    private int id;
    @NotNull
	private float  ocena;

	public Platnosc(float ocena) 
	{
		super( );
		this.ocena = ocena;
	}
	
	public Platnosc( ) 
	{
		super();
	}
	
	public int getOcena( ) 
	{
		return ocena;
	}
	public void setOcena(float ocena)  
	{
		this.ocena = ocena;
	}
}