package org.vortex.chat.services;

public class ServiceFactory {
	
	private static ConfigService configService;
	private static DeploymentService deploymentService;
	
	public static DeploymentService getDeploymentService() {
		return deploymentService;
	}
	
	public static void setDeploymentService(DeploymentService deploymentServic) {
		deploymentService = deploymentServic;
	}

	public static ConfigService getConfigService() {
		return configService;
	}

	public static void setConfigService(ConfigService configService) {
		ServiceFactory.configService = configService;
	}

}
