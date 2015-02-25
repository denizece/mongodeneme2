package denemeMongoJava;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoConnector {
	// Old version, uses Mongo
		//public myMongo mongo = new Mongo("localhost", 27017);
	 
		// Since 2.10.0, uses MongoClient
		public MongoClient mymongo;
		public MongoConnector(){
			 try {
				mymongo= new MongoClient( "localhost" , 27017 );
				DB db = mymongo.getDB("Instagram");
				DBCollection table = db.getCollection("datas");
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
