package org.vortex.chat.services;

public class ServiceFactory {
	
	private static DeploymentService deploymentService;
	
	public static DeploymentService getDeploymentService() {
		return deploymentService;
	}
	
	public static void setDeploymentService(DeploymentService deploymentServic) {
		deploymentService = deploymentServic;
	}

}
