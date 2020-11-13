package Database;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import UserAuthorization.Administrator;
import UserAuthorization.Gamer;
import UserAuthorization.User;
import UserInterface.changeGame;

import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;

import java.net.ConnectException;

import org.bson.Document;
import org.bson.conversions.Bson;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.print.Doc;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import java.awt.Cursor;
import java.lang.Object;

import Application.Game;
import Application.MyZone_Logic;
import Application.changeGame_Logic;



public class DataB 
{
	public static MongoDatabase connect()
	{
		String uri = "mongodb://game:game@gamedb-shard-00-00-hyep4.mongodb.net:27017,gamedb-shard-00-01-hyep4.mongodb.net:27017,gamedb-shard-00-02-hyep4.mongodb.net:27017/<dbname>?ssl=true&replicaSet=GameDB-shard-0&authSource=admin&retryWrites=true&w=majority";
		MongoClientURI clientURI = new MongoClientURI(uri);
		MongoClient mongoClient = new MongoClient(clientURI);
		MongoDatabase mongoDatabase = mongoClient.getDatabase("GameChangeDB");
		
		
		return mongoDatabase;
	}
	
	public static void method(Gamer gamer)
	{
	
		MongoDatabase dataBase = DataB.connect();
		MongoCollection collection = dataBase.getCollection("Users");
		
		Document document = new Document("Name",gamer.getName());
		document.append("Email", gamer.getMail());
		document.append("Password", gamer.getPassword());
		document.append("City", gamer.getCity());
		document.append("Year", gamer.getYear());
		collection.insertOne(document);
	}
	
	public static void method(Administrator administrator)
	{
	
		MongoDatabase dataBase = DataB.connect();
		MongoCollection collection = dataBase.getCollection("Admins");
		Document document = new Document("Name",administrator.getName());
		document.append("Email", administrator.getMail());
		document.append("Password", administrator.getPassword());
		document.append("City", administrator.getCity());
		document.append("Year", administrator.getYear());
		collection.insertOne(document);
	}
	
	public static void method(Game game)
	{
	
		MongoDatabase dataBase = DataB.connect();
		MongoCollection collection = dataBase.getCollection("Games");
		Document document = new Document("Game Name",game.getGameName());
		document.append("Catagory", game.getCatgory());
		document.append("Owner", game.getOwnerName());
		document.append("City", game.getLocation());
		document.append("Email", game.getEmail());
		collection.insertOne(document);
	}
	
	public  static Document getDocument(String Email)
	{
		MongoDatabase dataBase = DataB.connect();
		MongoCollection collection = dataBase.getCollection("Users");
		Document founDocument = (Document) collection.find(new Document("Email" , Email)).first();
		
		return founDocument;
	
	}
	
	
	public static MongoCursor<Document> getUsers ()
	{
		
		MongoDatabase database = DataB.connect();
		MongoCollection collection = database.getCollection("Games");
		FindIterable<Document> gamesDocs = collection.find(new Document("Email", MyZone_Logic.mailToCheck));
		MongoCursor<Document> cursor = gamesDocs.iterator();
		
		return cursor;
	}
	
	public static MongoCursor<Document> getGames ()
	{
		
		MongoDatabase database = DataB.connect();
		MongoCollection collection = database.getCollection("Games");
		FindIterable<Document> gamesDocs = collection.find(new Document("Game Name", changeGame_Logic.nameGameToCheck));
		MongoCursor<Document> cursor = gamesDocs.iterator();
		
		return cursor;
	}
}

