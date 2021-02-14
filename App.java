import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;
import com.mongodb.ServerAddress;

import java.util.List;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception
    {
            try {
        System.out.println( "Hello World!" );
        MongoClient mongoClient = new MongoClient("localhost" , 27017);
        DB db = mongoClient.getDB("mydb");
	DBCollection userCollection = db.getCollection("myc");
	System.out.println("Database connection successfull.");
	BasicDBObject document = new BasicDBObject();
	document.put("name", "nagesh");
        //userCollection.insert(document);
        userCollection.remove(document);
            }
            catch (Exception e) {
                    System.out.println(e);
            }

    }
}

