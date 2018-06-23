package org.vortex.chat;

import org.vortex.chat.services.DeploymentService;
import org.vortex.chat.services.ServiceFactory;

public class App {
	
    public static void main(String[] args) {
        
    	// init services (Deployments, Security, Cleanup, etc.)
    	initServices();
    	
    }
    
    public static void initServices(){
    	
    	// start deployment
    	DeploymentService deploymentService = new DeploymentService();
    	deploymentService.startService();

    	ServiceFactory.setDeploymentService(deploymentService);
    }
}
