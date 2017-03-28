package seltest12;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		
		 //Date and Time
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 LocalDateTime now = LocalDateTime.now();
		 System.out.println(dtf.format(now)); //2016/11/16 12:08:43
		
		logger.info("Test method testLogingFB started at CURRENTTIME of : " + dtf.format(now));
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/LajirMac/Downloads/geckodriver");
		WebDriver tdriver = BrowserFactory.startBrowser("Firefox","https://www.facebook.com");
		
		// Created Page Object using Page Factory
		SignIn login_page=PageFactory.initElements(tdriver, SignIn.class);
		
		
		login_page.LoginFB("USERNAME", "PASSWORD");
		 
		logger.info("LoginFB...completed at:" +dtf.format(now));
		logger.error("logger error");
		
		
		
	}
	

}
