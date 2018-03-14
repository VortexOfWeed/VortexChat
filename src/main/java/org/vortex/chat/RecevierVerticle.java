package org.vortex.chat;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class RecevierVerticle extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) throws Exception {
        vertx.eventBus().consumer("anAddress", message -> {
            System.out.println("1 received message.body() = "
                + message.body());
        });
    }

    @Override
    public void stop(Future<Void> stopFuture) throws Exception {
    }
}
