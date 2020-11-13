package Application;


public abstract class Product
{
	protected String ownerName;
	protected String email;
	protected String location;
	
	public Product(String ownerName, String email ,String location)
	{
		this.ownerName = ownerName;
		this.email = email;
		this.location = location;
	}
	
	public abstract String getEmail();
	
	public abstract String getOwnerName();
	
	public abstract String getLocation();
	
}
