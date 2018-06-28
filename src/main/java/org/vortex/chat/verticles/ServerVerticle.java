package org.vortex.chat.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;

public class ServerVerticle extends AbstractVerticle {
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
            }).listen(8080);
        System.out.println("Server Verticle started on port 8080");
    }
}
