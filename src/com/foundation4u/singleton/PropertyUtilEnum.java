package com.foundation4u.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public enum PropertyUtilEnum {
		
	INSTANCE;
	
	public Properties getPropertiesFile(){
		String propFilePath = System.getProperty("filePath")+File.separator+"design.properties";
		System.out.println("file path: "+propFilePath);
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(propFilePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return properties;
	}
}
