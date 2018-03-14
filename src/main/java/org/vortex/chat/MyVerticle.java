package org.vortex.chat;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class MyVerticle extends AbstractVerticle{
    @Override
    public void start(Future<Void> startFuture) throws Exception {
        System.out.println("MyVerticle started!");
    }

    @Override
    public void stop(Future<Void> stopFuture) throws Exception {
        System.out.println("MyVerticle stopped!");
    }
}
