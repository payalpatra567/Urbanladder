package com.cucumber.Utlities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertyFileReader {
	//public WebDriver driver;
	//public Properties prop;
	public static Properties loadFile() throws IOException {	
		 	Properties prop = new Properties();
			FileInputStream fil = new FileInputStream(".\\data.properties");
			prop.load(fil);
			//String BrowserName = prop.getProperty("browser");
			return prop;
	
	}

	

	
	

	

}
