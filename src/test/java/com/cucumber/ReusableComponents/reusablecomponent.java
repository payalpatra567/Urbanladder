package com.cucumber.ReusableComponents;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;


import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;

public class reusablecomponent {
	//Declare Driver Variable
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		//to get directory for relative path
		//System.out.println(new java.io.File(".").getCanonicalPath());
		
		//Getting Property value from Properties File
		
		
		//getting Browser Property
		String browser = reusablemethod.getBrowser(driver);
				//.getProperty("browser");
		
		//Seecting the correct browser
		if(browser.equals("chrome")) {
			
			//Google Chrome
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
			
			//Microsoft Edge
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			
			//Mozilla Firefox
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//Set an Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
		/*public void getScreenshots(String result) throws IOException {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.apache.commons.io.FileUtils.copyFile(src, new File(".\\screenshot\\"+result+"screenshot.png"));*/
			
	//}

}
