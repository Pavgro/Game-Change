package UserAuthorization;

import Database.DataB;

public class UserFactory 
{ 
	   public static void createUser(String mail,String  name,String  password,String  birthYear,String  city,String  code )
	   {
	      
	      if(code.isEmpty())
	      {
	    	  Gamer gamer = new Gamer(mail, name, password, birthYear, city);
	  		  DataB.method(gamer);
	      } 
	      
	      else if(code.equals("111"))
	      {
	    	  Administrator administrator = new Administrator(mail, name, password, birthYear, city,code);
	  		  DataB.method(administrator);
	      
	      }
	   }

}
