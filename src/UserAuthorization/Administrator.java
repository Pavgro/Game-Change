package UserAuthorization;

public class Administrator extends User
{


	private String birthYear;
	private String city;
	private String code;
	
	Administrator ( String mail,String name ,String password,String birthYear, String city, String code)
	{
		super(mail, name, password);
		this.birthYear = birthYear;
		this.city = city;
		this.code = code;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public String getYear()
	{
		return this.birthYear;
	}
	
	
	public String  getPassword() 
	{
		return this.password;
	}
	
	public String getMail()
	{
		return this.mail;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
	public String getCode()
	{	
		return this.code;
	}
	
	
	
}