package org.vortex.chat;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class BroadcastVerticle extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) throws Exception {
        vertx.eventBus().send   ("anAddress", "message 1");
    }

    @Override
    public void stop(Future<Void> stopFuture) throws Exception {
    }
}
