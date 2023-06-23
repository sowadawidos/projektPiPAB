@Entity
@Table
public class Wypozyczenie
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    @Table(name="wypozyczenia") 	
	@Id
    @GeneratedValue
    private int id;
    @NotNull
	private int isbn;
	private Date od;
	private Date do;

	public Wypozyczenie(int isbn, Date od, Date do) 
	{
		super( );
		this.isbn = isbn;
		this.od = od;
		this.do = do;
	}
	
	public Wypozyczenie( ) 
	{
		super();
	}
	
	public int getIsbn( ) 
	{
		return isbn;
	}
	public void setIsbn(int isbn)  
	{
		this.isbn = isbn;
	}
    public String getOd( ) 
	{
		return od;
	}
	public void setOd(Date od) 
	{
		this.od = od;
	}
	
	public double getDo( ) 
	{
		return do;
	}
	public void setDo(Date do) 
	{
		this.do = do;
	}
}