Feature: Homepage Login

Scenario: Homepage  login
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
And click the login page
When Enter the Emailadress and password
#And click the help and do the all operation
And close the  browser 

Scenario: Search page
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then Enter the Search product
And click the add to cart
And close the  browser

Scenario: Help page
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then click on help
And enter your problem and get your solution
And close the  browser

Scenario: Giftcard page
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then click on Giftcards
And click the wedding cards
Then enter the money and submit buttom
Then enter your details and click the confirm buttom
And close the  browser

Scenario: Giftcard page
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then click on stores
Then click the any product
And check the assertion
And close the  browser

Scenario: Trackorder page
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then click on Trackorder
Then enter the ordernumber and phone number
And click the submit
And close the  browser


Scenario: customerview
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then click on customerview
And store the customer review
And close the  browser

Scenario: bulkorder
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then click on bulkorder
And enter the name,city,phonenumber and email
Then click on next
And enter your message
Then click submit
And close the  browser

Scenario: Storage
Given Initialize the browser with chrome
And navigate to website_
And click the popup window 
Then click on storage
And close the  browser
#Scenario Outline: Data Driven
#Given Initialize the  browser with chrome
#And navigate to website_
#And click the popup window 
#And click the login page
#When Enter the "<Emailadress>" and "<password>"
#And close the browser 

#Examples:
#|	Emailadress					||   password  |
#|	ppatra9437@gmail.com		||  Payal@45   | 
