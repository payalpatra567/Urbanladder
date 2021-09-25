package com.cucumber.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.UIStore.BulkOrdersUI;
import com.cucumber.UIStore.GiftcardUI;

public class Bulkorder {
	private  WebDriver driver;
	BulkOrdersUI g = new BulkOrdersUI();
	public Bulkorder(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement clickBulkorders()
	{
		return driver.findElement(g.bulkorder);
	}
	public WebElement getName()
	{
		return driver.findElement(g.Name);
	}
	public WebElement getPhonenumber()
	{
		return driver.findElement(g.phonenumber);
	}
	public WebElement getCity()
	{
		return driver.findElement(g.city);
	}
	public WebElement getEmail()
	{
		return driver.findElement(g.email);
	}
	public WebElement clicknext()
	{
		return driver.findElement(g.next);
	}
	public WebElement getMessage()
	{
		return driver.findElement(g.yourans);
	}
	public WebElement clickSubmit()
	{
		return driver.findElement(g.submit);
	}
}
