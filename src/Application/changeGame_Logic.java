package Application;

import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import com.mongodb.client.MongoCursor;
import Database.DataB;

public class changeGame_Logic {
	
public static String nameGameToCheck;
	
	public static DefaultTableModel initTable() 
	{
		String[] columnNames = {"Game Name", "Catagory", "Email"};
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		MongoCursor<Document> games = DataB.getGames();
		while (games.hasNext()) {
			Document game = games.next();
	        model.addRow(new Object[] { game.get("Game Name"), game.get("Catagory") ,game.get("Email")});
			
		}
		return model;
	}
	
	public static void openWebPage(String url){
		   try {         
		     java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		   }
		   catch (java.io.IOException e) {
		       System.out.println(e.getMessage());
		   }
		}
	

}
