package com.cucumber.UIStore;

import org.openqa.selenium.By;

public class SearchUI {
	public By Search = By.xpath("//*[@id=\"search\"]");
	public By chairs = By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]");
	public By Selectchairs = By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[5]/div[2]/a[2]");
	public By price = By.xpath("//*[@id=\"buy_details_102245\"]/div[1]/div[1]/div[1]/div");
	public By Addtocart = By.xpath("//*[@id=\"add-to-cart-button\"]");
	

}
