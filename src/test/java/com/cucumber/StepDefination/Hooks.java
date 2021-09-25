package com.cucumber.StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.ReusableComponents.reusablecomponent;

import cucumber.api.Scenario;
import cucumber.api.java.After;



public class Hooks extends reusablecomponent {
	/*@After(order=1)
	public void takeScreenshotFailure(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(src, "image/png");
		}
	}
	@After(order=0)
	public void tearDown() {
		driver.close();
	}*/
	

}
