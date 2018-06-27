package org.vortex.chat.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigService implements Service {
	
	String configFile;
	Properties properties = null;
	
	public ConfigService() {

	}
	
	public ConfigService(String configFilePath) {
		this.configFile = configFilePath;
	}

	@Override
	public void configure() {
		
	}

	@Override
	public void startService() {
		InputStream stream = null;
		try {
			stream = new FileInputStream(new File(Constants.CONFIG_FILE_PATH));
			properties.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(stream != null) {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void stopService() {
		properties = null;
	}
	
	public String getProperty(String propertyKey) {
		if(properties != null) {
			return properties.getProperty(propertyKey);
		}
		return null;
	}

}
