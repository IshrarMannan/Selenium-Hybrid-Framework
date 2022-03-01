package pom.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	
	public ReadConfig()
	{
		File src = new File("./config/config.properties");

		try {
			FileInputStream input = new FileInputStream(src);
			prop = new Properties();
			prop.load(input);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=prop.getProperty("URL");
		return url;
	}
	
	public String getUsername()
	{
	String username=prop.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=prop.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=prop.getProperty("chromepath");
	return chromepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=prop.getProperty("firefoxpath");
	return firefoxpath;
	}
}
