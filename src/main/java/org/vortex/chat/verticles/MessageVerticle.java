package org.vortex.chat.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpMethod;

/**
 * Class to receive messages and send them to recipient. 
 * For every message a new instance of MessageSenderVerticle will be spawned.
 */
public class MessageVerticle extends AbstractVerticle{
	
	@Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> {
            if(req.method() == HttpMethod.POST){
                req.handler(buffer -> {

                });
            }
              req.response()
                .putHeader("content-type", "text/plain")
                .end("Hello from Vert.x!");
            }).listen(8081);
        System.out.println("Message Verticle started on port 8081");
    }

}
