package UserAuthorization;
import org.bson.Document;
import Database.DataB;

public class Home_limit
{
	public static boolean checkToLogin(String Email, String Password)
	{
		Document toCheck = DataB.getDocument(Email);
		if(toCheck !=null)
		{
			if(toCheck.containsValue(Password))
			{
				return true;
			}
			
			else 
			{
				return false;
			}
			
		}
		else 
		{
			return false;
		}

	}

}
