package UserAuthorization;

public class Gamer extends User
{
	private String birthYear;
	private String city;
	
	Gamer( String mail,String name ,String password,String birthYear, String city)
	{
		super(mail, name, password);
		this.birthYear = birthYear;
		this.city = city;
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
	
	
	
}