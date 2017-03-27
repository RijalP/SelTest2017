package seltest12;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import pages.SignIn;
import utilities.BrowserFactory;

public class testSeltest {
	
	
	
	
	@Test
	public void testLoginFB() throws InterruptedException
	{
		Logger logger =Logger.getLogger(testSeltest.class);
		 PropertyConfigurator.configure("Log4jmy.properties");
		
		
		logger.info("testLogingFB started");
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/LajirMac/Downloads/geckodriver");
		WebDriver tdriver = BrowserFactory.startBrowser("Firefox","https://www.facebook.com");
		
		// Created Page Object using Page Factory
		SignIn login_page=PageFactory.initElements(tdriver, SignIn.class);
		
		
		login_page.LoginFB("USERNAME", "PASSWORD");
		 
		logger.info("LoginFB...completed");
		logger.error("logger error");
		
		
		
	}
	

}
