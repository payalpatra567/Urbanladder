$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Login",
  "description": "",
  "id": "homepage-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Homepage  login",
  "description": "",
  "id": "homepage-login;homepage--login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Initialize the  browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "navigate to website_",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click the popup window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click the login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter the Emailadress and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 7081673400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.navigate_to_website_()"
});
formatter.result({
  "duration": 2337793900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.click_the_popup_window()"
});
formatter.result({
  "duration": 19088405500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.click_the_login_page()"
});
formatter.result({
  "duration": 275672100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.enter_the_Emailadress_and_password()"
});
formatter.result({
  "duration": 11120890100,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d93.0.4577.82)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAB-63761848683\u0027, ip: \u0027172.18.23.148\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\User\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51385}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: be00ba06064a36226188814fa5dabbe2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.cucumber.StepDefination.stepDefination.enter_the_Emailadress_and_password(stepDefination.java:67)\r\n\tat ✽.When Enter the Emailadress and password(./Features/Homepage.feature:8)\r\n",
  "status": "failed"
});
});