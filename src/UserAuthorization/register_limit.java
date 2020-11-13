package UserAuthorization;

import java.util.regex.Pattern;

public class register_limit 
{  

	public static boolean passwordCheck(String Password, String Password1)
	{
		if(!Password.isEmpty())
		{
			if(Password.equals(Password1))
			{
				return true;
			
			}
		}
		return false;
		
	}
	
	
	
	public static boolean mailValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	

}


