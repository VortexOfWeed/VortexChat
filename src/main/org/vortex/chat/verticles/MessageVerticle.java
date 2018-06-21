package org.vortex.chat.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpMethod;

/**
 * Class to receive messages and send them to recipient. 
 * For every message a new instance of MessageSenderVerticle will be spawned.
 */
public class MessageVerticle extends AbstractVerticle{
	
	Vertx vertx;
	
	public MessageVerticle(Vertx vertx) {
		this.vertx = vertx;
	}
	
	@Override
    public void start() throws Exception {
		
        vertx.createHttpServer().requestHandler(req -> {

        	/*
				// get message and recipient from request body
				// vertx.deployVerticle(new MessageSenderVerticle());
        	 */

            if(req.method() == HttpMethod.POST){
                req.handler(buffer -> {

                });
            }
              req.response()
                .putHeader("content-type", "text/plain")
                .end("Hello from Vert.x!");
            }).listen(8080);
        System.out.println("HTTP server started on port 8080");
    }

}
