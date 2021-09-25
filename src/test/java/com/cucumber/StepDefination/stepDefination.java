package com.cucumber.StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cucumber.PageObject.Bulkorder;
//import com.UrbanLadder.PageObject.Viewcustomer;
//import com.UrbanLadder.PageObject.TrackOrder;
//import com.UrbanLadder.PageObject.Stores;
import com.cucumber.PageObject.GiftCard;
import com.cucumber.PageObject.Help;
//import com.UrbanLadder.PageObject.Help;
//import com.UrbanLadder.PageObject.Search;
import com.cucumber.PageObject.Landingpage;
import com.cucumber.PageObject.LoginPage;
import com.cucumber.PageObject.Navigation;
import com.cucumber.PageObject.Search;
import com.cucumber.PageObject.Storage;
import com.cucumber.PageObject.Stores;
import com.cucumber.PageObject.TrackOrder;
import com.cucumber.PageObject.Viewcustomer;
//import com.UrbanLadder.PageObject.Landingpage;
import com.cucumber.ReusableComponents.reusablecomponent;
import com.cucumber.ReusableComponents.reusablemethod;
import com.cucumber.Utlities.LogFilesUtil;


@RunWith(Cucumber.class)
public class stepDefination extends reusablecomponent {
	Logger log = LogFilesUtil.getLogger(LogFilesUtil.class);
	private reusablemethod r ;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver = initializeDriver();
		 log.info("driver is setup ");
	}


    @And("^navigate to website_$")
    public void navigate_to_website_() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
          driver.manage().window().maximize();
		r.getURL(driver);
		log.info("URL is opened ");
    }
    @And("^click the popup window$")
    public void click_the_popup_window() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    	Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		Thread.sleep(9000l);
    }
    @And("^click the login page$")
    public void click_the_login_page() throws Throwable {
    	Landingpage l = new Landingpage(driver);

        // Write code here that turns the phrase above into concrete actions
    	l.getLogin1().click();
		//log.info(" user click the login icone in that time sign in and sign up");
		l.selectLogin1().click();
		//log.info("user click the login buttom");
    }

    @When("^Enter the Emailadress and password$")
    public void enter_the_Emailadress_and_password() throws Throwable {
    	LoginPage lp = new LoginPage(driver);
		
		//log.info("enter the email adress and password");
		Thread.sleep(1000L);
		lp.getEmail().click();
		lp.getEmail().sendKeys("ppatra9437@gmail.com");
		lp.getPassword().click();
		lp.getPassword().sendKeys("Payal@1234");
		lp.getLogin().click();
		System.out.println("it is print the in valid text : "+lp.getText().getText());
    }
    @Then("^Enter the Search product$")
    public void enter_the_search_product() throws Throwable {
        //throw new PendingException();
    	Search s = new Search(driver);
		s.getSearch().click();
		s.getSearch().sendKeys("chairs");
		s.getSearch().sendKeys(Keys.DOWN);
		s.getSearch().sendKeys(Keys.ENTER);
		log.info("enter the send keys and it show the in search box");
		Thread.sleep(1000l);
		Actions A = new Actions(driver);
		A.moveToElement(s.clickChair());
		A.moveToElement(s.getchairs()).click().build().perform();
		

		System.out.println("Show the all link available in the page : "+driver.findElements(By.tagName("a")).size());
		log.info("here show the available link present in the page");
		System.out.println("Print the price of Mike study chair : "+s.getPrice().getText());
		//Assert.assertEquals(s.getTitle().getText(), "Mike study chair");
    }

    @And("^click the add to cart$")
    public void click_the_add_to_cart() throws Throwable {
        //throw new PendingException();
    	Search s = new Search(driver);
    	//System.out.println("Print the price of Mike study chair : "+s.getPrice().getText());
		s.getAddtocart().click();
    }
    @Then("^click on help$")
    public void click_on_help() throws Throwable {
       // throw new PendingException();
    	Help hc = new Help(driver);
		hc.getHelp().click();
    	
    }

    @And("^enter your problem and get your solution$")
    public void enter_your_problem_and_get_your_solution() throws Throwable {
        //throw new PendingException();
    	Help hc = new Help(driver);
    	hc.getIssue().sendKeys("why");
		log.info("enter the send keys value");
		hc.getIssue().sendKeys(Keys.DOWN);
		hc.getIssue().sendKeys(Keys.ENTER);
		log.info("next it shows the which is customer enter");
    }
    @Then("^click on Giftcards$")
    public void click_on_giftcards() throws Throwable {
        //throw new PendingException();
    	GiftCard gc = new GiftCard(driver);
		gc.getGiftcard().click();
		log.info("shows the giftcard page");
    }

    @Then("^enter the money and submit buttom$")
    public void enter_the_money_and_submit_buttom() throws Throwable {
       // throw new PendingException();
    	GiftCard gc = new GiftCard(driver);
    	log.info("click the price");
		gc.getPrice().click();
		gc.clickNext().click();
    }

    @Then("^enter your details and click the confirm buttom$")
    public void enter_your_details_and_click_the_confirm_buttom() throws Throwable {
        //throw new PendingException();
    	GiftCard gc = new GiftCard(driver);
    	gc.getRecipientname().sendKeys("pranjal");
		gc.getRecipientEmail().sendKeys("Pranjal123@gmail.com");
		log.info("enter the recipient name and email");
		gc.getYourname().sendKeys("payal");
		gc.getYouremail().sendKeys("ppatra9437@gmail.com");
		gc.getYournumber().sendKeys("9437784420");
		gc.getYourmessage().sendKeys("welcome");
		log.info("enter the your name,email,number and message");
		gc.getconfirm().click();
    }

    @And("^click the wedding cards$")
    public void click_the_wedding_cards() throws Throwable {
       // throw new PendingException();
    	GiftCard gc = new GiftCard(driver);
    	Actions A = new Actions(driver);
		A.moveToElement(gc.getweddingcard());
		A.moveToElement(gc.Selectwedingcard()).click().build().perform();
		log.info("it is  automatically click the wedding button  ");
    }
    @Then("^click on stores$")
    public void click_on_stores() throws Throwable {
        //throw new PendingException();
    	Stores st = new Stores(driver);
		st.getStores().click();
    }

    @Then("^click the any product$")
    public void click_the_any_product() throws Throwable {
        //throw new PendingException();
    	Stores st = new Stores(driver);
    	log.info("click the store it show all available furniture");
		st.getStoreDetails().click();
    }

    @And("^check the assertion$")
    public void check_the_assertion() throws Throwable {
        //throw new PendingException();
    	Stores st = new Stores(driver);
    	System.out.println(st.getTitle().getText());
		log.info("it is check the assert is correct or not");
		Assert.assertEquals(st.getTitle().getText(), "Urban Ladder Furniture Store - Hadapsar");
    }
    @Then("^click on Trackorder$")
    public void click_on_trackorder() throws Throwable {
       // throw new PendingException();
    	TrackOrder to = new TrackOrder(driver);
		to.getTrackorder().click();
		log.info("click the trackorder buttom");
		//to.getSubmit().click();
    }

    @Then("^enter the ordernumber and phone number$")
    public void enter_the_ordernumber_and_phone_number() throws Throwable {
        //throw new PendingException();
    	TrackOrder to = new TrackOrder(driver);
    	log.info("click the track order it is showing enter the orer number and phone number");
		to.getOrderNo().sendKeys("51ndjkdv54r4d");
		to.getPhoneNo().sendKeys("9437784420");
    }

    @And("^click the submit$")
    public void click_the_submit() throws Throwable {
        //throw new PendingException();
    	TrackOrder to = new TrackOrder(driver);
    	log.info("click the submit buttom");
		to.getSubmit().click();
    }
    @Then("^click on customerview$")
    public void click_on_customerview() throws Throwable {
       // throw new PendingException();
    	Viewcustomer v = new Viewcustomer(driver);
    	log.info("click the customer view");
		v.getViewCustomer().click();
    }

    @And("^store the customer review$")
    public void store_the_customer_review() throws Throwable {
       // throw new PendingException();
    	Viewcustomer v = new Viewcustomer(driver);
    	log.info("print the customer review");
		System.out.println("print customer review : "+v.getViewCustomerreview().getText());
    }
    @Then("^click on bulkorder$")
    public void click_on_bulkorder() throws Throwable {
        //throw new PendingException();
    	Bulkorder b = new Bulkorder(driver);
    	b.clickBulkorders();
    }

    @Then("^click on next$")
    public void click_on_next() throws Throwable {
        //throw new PendingException();
    	Bulkorder b = new Bulkorder(driver);
       	b.clicknext().click();
    }

    @Then("^click submit$")
    public void click_submit() throws Throwable {
    	Bulkorder b = new Bulkorder(driver);
    	b.clickSubmit().click();
       // throw new PendingException();
    }

    @And("^enter the name,city,phonenumber and email$")
    public void enter_the_namecityphonenumber_and_email() throws Throwable {
        //throw new PendingException();
    	Bulkorder b = new Bulkorder(driver);
    	b.getName().sendKeys("payal patra");
    	b.getPhonenumber().sendKeys("9437771533");
    	b.getCity().sendKeys("kalimela");
    	b.getEmail().sendKeys("ppatra947@gmail.com");
    }

    @And("^enter your message$")
    public void enter_your_message() throws Throwable {
    	Bulkorder b = new Bulkorder(driver);
    	b.getMessage().sendKeys("thank you");
       // throw new PendingException();
    }
    @Then("^click on storage$")
    public void click_on_storage() throws Throwable {
        //throw new PendingException();
    	Storage s = new Storage(driver);
    	s.clickStorage().click();
    }

    @And("^close the  browser$")
    public void close_the_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }



}