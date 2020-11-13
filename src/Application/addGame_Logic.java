package Application;

import java.util.regex.Pattern;
import Database.DataB;

public class addGame_Logic
{
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

	public static void createGame (String name, String email, String gamename, String category, String city) 
	{
		
		Game game = new Game(name, email, gamename, category, city);
		DataB.method(game);
		
	}
	
}
