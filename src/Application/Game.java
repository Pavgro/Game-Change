package Application;

public class Game extends Product
{
	String gameName;
	String catagory;
	

	public Game(String ownerName, String email ,String gameName,String catagory, String location)
	{
		super(ownerName, email,location);
		this.gameName = gameName;
		this.catagory = catagory;
	}
	
	public String getGameName()
	{
		return this.gameName;
	}
	
	public String getCatgory()
	{
		return this.catagory;
	}
	
	public void setGameName(String gameName)
	{
		 this.gameName = gameName;
	}
	
	public void setCatagory(String catagory)
	{
		 this.catagory = catagory;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String getOwnerName()
	{
		return this.ownerName;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	

}
