package com.cucumber.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.UIStore.LandingpageUIStore;



public class Landingpage {
	private  WebDriver driver;
	LandingpageUIStore h = new LandingpageUIStore();
	public Landingpage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getPopup()
	{
		return driver.findElement(h.Pop_up);
	}
	public WebElement getLogin1() {
		return driver.findElement(h.login);
	}
	
	public WebElement selectLogin1() {
		return driver.findElement(h.selectLogin);
	}
}
