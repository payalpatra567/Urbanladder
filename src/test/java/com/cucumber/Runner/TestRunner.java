package com.cucumber.Runner;


import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Homepage.feature",
					glue = "com.cucumber.StepDefination",
					dryRun = false,
					monochrome = true,
					plugin = {"pretty","html: test-output"
							})
public class TestRunner extends AbstractTestNGCucumberTests {
//public static Logger log = LogManager.getLogger(reusablecomponent.class.getName());


}
