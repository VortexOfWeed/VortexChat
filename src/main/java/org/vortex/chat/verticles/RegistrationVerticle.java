package org.vortex.chat.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class RegistrationVerticle extends AbstractVerticle{
    @Override
    public void start() throws Exception {

        Router router = Router.router(vertx);
        router.route().handler(BodyHandler.create());

        // Set up routes
        router.post("/api/test").handler(this::test);
        router.post("/api/register").handler(this::register);

        // Initialize Server
        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(8082, "0.0.0.0");
        System.out.println("Registration Verticle started on port 8082");


    }


    private void test(RoutingContext rc) {
        HttpServerResponse response = rc.response();
        JsonObject bodyAsJson = rc.getBodyAsJson();
        if (bodyAsJson != null) {
            System.out.println(bodyAsJson);
            response.setStatusCode(200)
                    .end(String.format("We're good!!", bodyAsJson));
        } else {
            response.setStatusCode(400)
                    .end(String.format("Something went wrong here", bodyAsJson));
        }
    }

    private void register(RoutingContext rc){
        HttpServerResponse response = rc.response();
        JsonObject bodyAsJson = rc.getBodyAsJson();
        if (bodyAsJson != null) {
            System.out.println(bodyAsJson);

            response.setStatusCode(200)
                    .end(String.format("We're good!!", bodyAsJson));
        } else {
            response.setStatusCode(400)
                    .end(String.format("Something went wrong here", bodyAsJson));
        }
    }

}
