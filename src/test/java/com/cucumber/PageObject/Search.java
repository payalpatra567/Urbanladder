package com.cucumber.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.UIStore.SearchUI;



public class Search {
	private  WebDriver driver;
	SearchUI s = new SearchUI();
	public Search(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getSearch()
	{
		return driver.findElement(s.Search);
	}
	public WebElement clickChair()
	{
		return driver.findElement(s.chairs);
		
	}
	public WebElement getchairs()
	{
		return driver.findElement(s.Selectchairs);
	}
	public WebElement getPrice() 
	{
		return driver.findElement(s.Search);
	}
	public WebElement getAddtocart()
	{
		return driver.findElement(s.Addtocart);
	}

}
