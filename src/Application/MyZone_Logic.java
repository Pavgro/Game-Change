package Application;


import Database.DataB;
import com.mongodb.client.MongoCursor;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;


public class MyZone_Logic
{
	public static String mailToCheck;
	
	public static DefaultTableModel initTable() 
	{
		String[] columnNames = {"Game Name", "Catagory"};
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		MongoCursor<Document> games = DataB.getUsers();
		while (games.hasNext()) {
			Document game = games.next();
	        model.addRow(new Object[] { game.get("Game Name"), game.get("Catagory")});
			
		}
		return model;
	}
	
	
	
	
	

}