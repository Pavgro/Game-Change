package UserAuthorization;

public class Admin
{
	private String name;
	private String email;
	private String password;
	
	static Admin admin;

	private Admin()
	{
		this.name = "adminSingleton";
		this.email = "adminSingleton@email.com";
		this.password = "123";
		
	}
	
	public static Admin getAdmin() 
	{
		if (admin == null)
			admin = new Admin();
		return admin;
	}
	

}
