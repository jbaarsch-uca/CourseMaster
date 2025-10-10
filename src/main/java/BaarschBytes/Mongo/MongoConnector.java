package BaarschBytes.Mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class MongoConnector {

    public MongoDatabase connect(String connectionPath, String dbName) {
        MongoClient mongoClient = MongoClients.create(connectionPath);
        return mongoClient.getDatabase(dbName);
    }




}
