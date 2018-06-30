package org.vortex.chat.database;

import org.vortex.chat.services.ConfigService;
import org.vortex.chat.utils.Constants;
import org.vortex.chat.services.ServiceFactory;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;

public class VortexMongoClient {
	
	ConfigService configService = null;
	MongoClient mongoClient = null;

	public VortexMongoClient(Vertx vertx){
	    if (mongoClient != null){

        }
        configService = ServiceFactory.getConfigService();

        JsonObject config = Vertx.currentContext().config();

        String uri = config.getString("mongo_uri");
        if (uri == null) {
            uri = Constants.MONGO_PROTOCOL + "://" + configService.getProperty(Constants.MONGO_HOST)
                    + ":" + configService.getProperty(Constants.MONGO_PORT);
        }
        String db = config.getString("mongo_db");
        if (db == null) {
            db = Constants.DB_NAME;
        }

        JsonObject mongoconfig = new JsonObject()
                .put("connection_string", uri)
                .put("db_name", db);

        mongoClient = MongoClient.createShared(vertx, mongoconfig);
    }



}
