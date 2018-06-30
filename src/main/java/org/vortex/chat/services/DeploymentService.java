package org.vortex.chat.services;

import org.vortex.chat.database.VortexMongoClient;
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
		vertx.deployVerticle(new VortexMongoClient());
//		vertx.deployVerticle(new ServerVerticle());
		vertx.deployVerticle(new RegistrationVerticle());
//		vertx.deployVerticle(new MessageVerticle());
	}

	@Override
	public void stopService() {
		// TODO Auto-generated method stub
		
	}

}
