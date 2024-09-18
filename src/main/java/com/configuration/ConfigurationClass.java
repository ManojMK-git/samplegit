package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ConfigurationClass {
	
	public static  Properties prop;
	
 public ConfigurationClass () throws IOException {  //constructor
	


	File f = new File ("C:\\Users\\h\\eclipse-workspace\\Adactin\\Configuration\\Config.Properties");
		  	
	FileInputStream fi = new FileInputStream(f);
	
	prop = new Properties();
	prop.load(fi);

	
}
public String getUrl() {
	String url = prop.getProperty("Url");
	return url;
}
public String getUsername() {
	String Username = prop.getProperty("Username");
	
	return Username;
}
public String getPassword() {
	String Password = prop.getProperty("Password");
	return Password;
}
}
