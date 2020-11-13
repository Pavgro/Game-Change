package UserAuthorization;

public abstract class User 
{
	protected String mail;
	protected String name;
	protected String password;
	

	
	User(String mail,String name, String password)
	{
		this.mail= mail;
		this.name = name;
		this.password = password;
		
		
	}
	
	public abstract String getPassword();
	
	public abstract String getMail();
	
	public abstract String getName();
	
	
	
	
		
}
