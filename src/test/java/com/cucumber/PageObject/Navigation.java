package com.cucumber.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.UIStore.NavigationbarUI;

public class Navigation {
	NavigationbarUI n = new NavigationbarUI();
	private WebDriver driver;
	public Navigation(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getNavBar() {
		return driver.findElement(n.navBar);
	}
	public WebElement getTitle() {
		return driver.findElement(n.Text);
	}
	public WebElement getStudyItem() {
		return driver.findElement(n.study);
	}
	public WebElement getLaptopTables() {
		return driver.findElement(n.laptopTables);
	}
}
