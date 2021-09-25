package com.cucumber.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.UIStore.StorageUI;
import com.cucumber.UIStore.StoreUI;

public class Storage {
	StorageUI st = new StorageUI();
	private  WebDriver driver;
	public Storage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement clickStorage()
	{
		return driver.findElement(st.storage);
	}

}
