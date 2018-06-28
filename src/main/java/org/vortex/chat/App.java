package org.vortex.chat;

import org.vortex.chat.services.ConfigService;
import org.vortex.chat.services.DeploymentService;
import org.vortex.chat.services.ServiceFactory;
import org.vortex.chat.utils.Constants;

public class App {
	
    public static void main(String[] args) {
        
    	// init services (Deployments, Security, Cleanup, etc.)
    	initServices();
    	
    }
    
    public static void initServices(){
    	
    	// start config
    	ConfigService configService = new ConfigService(Constants.CONFIG_FILE_PATH);
    	configService.startService();
    	
    	ServiceFactory.setConfigService(configService);
    	
    	// start deployment
    	DeploymentService deploymentService = new DeploymentService();
    	deploymentService.startService();

    	ServiceFactory.setDeploymentService(deploymentService);
    	
    }
}
