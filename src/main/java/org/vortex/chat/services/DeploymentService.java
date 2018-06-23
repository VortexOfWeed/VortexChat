package org.vortex.chat.services;

import org.vortex.chat.verticles.MessageVerticle;
import org.vortex.chat.verticles.MongoClientVerticle;
import org.vortex.chat.verticles.RegistrationVerticle;

import io.vertx.core.Vertx;

public class DeploymentService implements Service{
	
	Vertx vertx;
	
	public DeploymentService() {
		vertx = Vertx.vertx();
	}

	@Override
	public void configure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startService() {

//		vertx.deployVerticle(new MongoClientVerticle());
		vertx.deployVerticle(new RegistrationVerticle());
		vertx.deployVerticle(new MessageVerticle(vertx));
		
	}

	@Override
	public void stopService() {
		// TODO Auto-generated method stub
		
	}

}
