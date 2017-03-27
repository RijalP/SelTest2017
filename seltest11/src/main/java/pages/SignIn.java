package pages;

//import java.util.logging.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.log4testng.Logger;
//import org.testng.log4testng.Logger;
//import org.apache.log4j.Logger;
//import org.testng.Reporter;
//import org.apche.log4j.xml.DOMConfigurator;
//import utility.Log;


public class SignIn{
	
	WebDriver driver;
	// Logger strlogger = Logger.getLogger(strlogger.class.getName());
	 //PropertyConfigurator.configure("Log4j.properties");
	// Logger strlogger = Logger.getLogger (SignIn.class.getName()); 
	
	//Username,Email, Password, loginBtn field
	
		@FindBy(name="email")
			WebElement Username;
		
		@FindBy(xpath= "//*[@id='pass']")
		WebElement Password;
		
		@FindBy(xpath ="id('u_0_q')") //---//*[@id="u_0_u"]
		WebElement LoginBtn;
		
			
		
		
		public void LoginFB(String User, String Pass) throws InterruptedException
		{
		// strlogger.info("Logging into my Account");	
		 Username.sendKeys(User);
		 Password.sendKeys(Pass);
		 Thread.sleep(3000);
		 LoginBtn.sendKeys(Keys.RETURN);       //LoginBtn.click();
			
		}

}
